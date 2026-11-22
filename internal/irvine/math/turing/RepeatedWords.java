package irvine.math.turing;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Finite forward closure on pairs of run-compressed tapes (RepWL).
 * @author Gregory Morse
 */
final class RepeatedWords {
  private final int[] mRules;
  private final int mWidth;
  private final int mSaturation;
  private final int mStepLimit;
  private final int mNodeLimit;
  private final HashMap<Run, Run> mRuns = new HashMap<>();
  private final HashMap<Long, Long> mBlocks = new HashMap<>();
  private final HashSet<Long> mSeen = new HashSet<>();
  private final ArrayDeque<Node> mPending = new ArrayDeque<>();
  private boolean mInconclusive;

  RepeatedWords(final int[] rules, final int width, final int saturation, final int stepLimit, final int nodeLimit) {
    if (width < 1 || width > 59 || saturation < 2 || saturation > 100 || stepLimit < 1 || nodeLimit < 1 || nodeLimit > 200_000) {
      throw new IllegalArgumentException("Unsafe repeated-word parameters");
    }
    this.mRules = rules;
    this.mWidth = width;
    this.mSaturation = saturation;
    this.mStepLimit = stepLimit;
    this.mNodeLimit = nodeLimit;
  }

  private static final class Run {
    private final long mWord;
    private final int mCount;
    private final Run mTail;
    private final int mId;

    private Run(final long word, final int count, final Run tail, final int id) {
      this.mWord = word;
      this.mCount = count;
      this.mTail = tail;
      this.mId = id;
    }

    @Override
    public int hashCode() {
      return (Long.hashCode(mWord) * 31 + mCount) * 31 + (mTail == null ? 0 : mTail.mId);
    }

    @Override
    public boolean equals(final Object other) {
      if (!(other instanceof Run)) {
        return false;
      }
      final Run run = (Run) other;
      return mWord == run.mWord && mCount == run.mCount && mTail == run.mTail;
    }
  }

  private static final class Node {
    private final Run mLeft;
    private final Run mRight;
    private final int mStateDir;

    private Node(final Run left, final Run right, final int stateDir) {
      this.mLeft = left;
      this.mRight = right;
      this.mStateDir = stateDir;
    }
  }

  private Run push(final Run tail, final long word, final int count) {
    if (count == 0 || word == 0 && tail == null) {
      return tail;
    }
    if (tail != null && word == tail.mWord) {
      return push(tail.mTail, word, Math.min(mSaturation, count + tail.mCount));
    }
    final Run key = new Run(word, count, tail, mRuns.size() + 1);
    final Run existing = mRuns.putIfAbsent(key, key);
    return existing == null ? key : existing;
  }

  private void enqueue(final Run left, final Run right, final int stateDir) {
    final long l = left == null ? 0 : left.mId;
    final long r = right == null ? 0 : right.mId;
    // At most four interned runs are created per visited node, far below 2^28.
    final long key = l << 32 | r << 4 | stateDir;
    if (mSeen.add(key)) {
      if (mSeen.size() > mNodeLimit) {
        mInconclusive = true;
      } else {
        mPending.addLast(new Node(left, right, stateDir));
      }
    }
  }

  private void expand(final Node node) {
    final boolean right = (node.mStateDir & 1) != 0;
    final Run side = right ? node.mRight : node.mLeft;
    final long word = side == null ? 0 : side.mWord;
    final long key = word << 4 | node.mStateDir;
    long exit = mBlocks.getOrDefault(key, -1L);
    if (exit < 0) {
      int at = right ? 0 : mWidth - 1;
      int state = node.mStateDir >>> 1;
      long updated = word;
      for (int i = 0; i < mStepLimit; ++i) {
        final int rule = mRules[2 * state + (int) (updated >>> at & 1)];
        if (rule < 0) {
          break;
        }
        updated = updated & ~(1L << at) | (long) (rule >>> 1 & 1) << at;
        at += (rule & 1) == 0 ? -1 : 1;
        state = rule >>> 2;
        if (at < 0 || at == mWidth) {
          exit = updated << 4 | 2 * state | (rule & 1);
          mBlocks.put(key, exit);
          break;
        }
      }
      if (exit < 0) {
        mInconclusive = true;
        return;
      }
    }
    final long updated = exit >>> 4;
    final int stateDir = (int) (exit & 15);
    if (side == null) {
      move(node, right, null, updated, stateDir);
    } else {
      // A saturated run denotes >= T copies. After popping, both T-1 and
      // >= T copies are possible; try both before pushing the modified block.
      if (side.mCount == mSaturation) {
        move(node, right, side, updated, stateDir);
      }
      move(node, right, push(side.mTail, word, side.mCount - 1), updated, stateDir);
    }
  }

  private void move(final Node node, final boolean enteredRight, final Run remaining, final long word, final int stateDir) {
    final Run left = enteredRight ? node.mLeft : remaining;
    final Run right = enteredRight ? remaining : node.mRight;
    if ((stateDir & 1) == 0) {
      enqueue(left, push(right, word, 1), stateDir);
    } else {
      enqueue(push(left, word, 1), right, stateDir);
    }
  }

  boolean closes() {
    enqueue(null, null, 1); // Blank tape; enter the block to the right in A.
    while (!mPending.isEmpty() && !mInconclusive) {
      expand(mPending.removeFirst());
    }
    return !mInconclusive;
  }
}

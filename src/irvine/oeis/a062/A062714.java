package irvine.oeis.a062;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A062714 Minimal length of a sequence with terms from {1, 2, 3, ..., n} which contains, as a subsequence, each possible ordering of the n symbols 1, 2, 3, ..., n.
 * @author Sean A. Irvine
 */
public class A062714 extends Sequence1 {

  private static final class Marker {

    private final int mN;
    private final int mMask;
    private final HashSet<Long> mPerms;
    private final int[] mSeq;

    private Marker(final int n, final HashSet<Long> perms, final int[] seq) {
      mN = n;
      mPerms = perms;
      mSeq = seq;
      mMask = (1 << n) - 1;
    }

    private void build(final int pos, final long v, final int marks, final int cnt) {
      if (cnt == mN) {
        if (marks == mMask) {
          mPerms.add(v);
        }
      } else if (pos + mN - cnt - 1 < mSeq.length) {
        build(pos + 1, v, marks, cnt);
        final int m = marks | (1 << mSeq[pos]);
        if (m != marks) {
          build(pos + 1, v * mN + mSeq[pos], m, cnt + 1);
        }
      }
    }
  }

  private static final class State implements Comparable<State> {
    private final int[] mSeq;
    private final int mSize;

    private State(final int[] seq, final int n) {
      if (seq.length > 63) {
        throw new UnsupportedOperationException();
      }
      final HashSet<Long> perms = new HashSet<>();
      mSeq = seq;
      new Marker(n, perms, seq).build(0, 0, 0, 0);
      mSize = perms.size();
    }

    @Override
    public int compareTo(final State state) {
      final int c = Integer.compare(state.mSize, mSize);
      if (c != 0) {
        return c;
      }
      return Arrays.compare(mSeq, state.mSeq);
    }
  }

  private int mN = 0;
  private int mF = 1;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    if (++mN > 12) {
      throw new UnsupportedOperationException();
    }
    mF *= mN;
    int best = Integer.MAX_VALUE;
    final TreeSet<State> states = new TreeSet<>();
    states.add(new State(IntegerUtils.identity(new int[mN]), mN));
    while (!states.isEmpty()) {
      final State s = states.pollFirst();
      if (s.mSize == mF) {
        if (s.mSeq.length < best) {
          best = s.mSeq.length;
          if (mVerbose) {
            StringUtils.message("a(" + mN + ") <= " + best);
          }
        }
      } else if (s.mSeq.length + 1 < best) {
        final int prev = s.mSeq[s.mSeq.length - 1];
        for (int k = 0; k < mN; ++k) {
          if (k != prev) { // no point in repeating a number
            final int[] next = Arrays.copyOf(s.mSeq, s.mSeq.length + 1);
            next[next.length - 1] = k;
            final State newState = new State(next, mN);
            if (newState.mSize > s.mSize) {
              // Slightly heuristic, only explore new states increasing number of covered permutations
              states.add(newState);
            }
          }
        }
      }
    }
    return Z.valueOf(best);
  }
}

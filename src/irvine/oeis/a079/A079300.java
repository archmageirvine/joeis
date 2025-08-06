package irvine.oeis.a079;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A079300 a(n) = number of shortest addition chains ending in n.
 * @author Sean A. Irvine
 */
public class A079300 extends Sequence1 {

  private static final class ChainNode {
    private final int mHead;
    private final ChainNode mTail;

    private ChainNode(final int head, final ChainNode tail) {
      mHead = head;
      mTail = tail;
    }

    @Override
    public String toString() {
      if (mTail == null) {
        return String.valueOf(mHead);
      }
      return mHead + "," + mTail;
    }
  }

  private final DynamicIntArray mShortest = new DynamicIntArray();
  private final DynamicIntArray mShortestCount = new DynamicIntArray();
  private List<ChainNode> mActiveChains = null;
  private int mChainLength = -1;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mShortest.get(mN) == 0) {
      if (++mChainLength == 0) {
        mActiveChains = Collections.singletonList(new ChainNode(1, null));
        return Z.ONE;
      } else {
        final Set<String> seen = new HashSet<>();
        final List<ChainNode> newChains = new ArrayList<>();
        for (final ChainNode c : mActiveChains) {
          final int head = c.mHead;
          ChainNode s = c;
          while (s != null && 2 * s.mHead > head) {
            final int h = s.mHead;
            for (ChainNode k = s; k != null && h + k.mHead > head; k = k.mTail) {
              final int n = h + k.mHead;
              final ChainNode newChain = new ChainNode(n, c);
              if (seen.add(newChain.toString())) {
                newChains.add(newChain);
                final int sh = mShortest.get(n);
                if (sh == 0) {
                  mShortest.set(n, mChainLength);
                  mShortestCount.set(n, 1);
                } else if (sh == mChainLength) {
                  mShortestCount.increment(n);
                }
              }
            }
            s = s.mTail;
          }
        }
        mActiveChains = newChains;
      }
    }
    return Z.valueOf(mShortestCount.get(mN));
  }
}

package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.DynamicIntArray;

/**
 * A003313 Length of shortest addition chain for n.
 * @author Sean A. Irvine
 */
public class A003313 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A003313(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A003313() {
    super(1);
  }

  private static final class ChainNode {
    private final int mHead;
    private final ChainNode mTail;

    private ChainNode(final int head, final ChainNode tail) {
      mHead = head;
      mTail = tail;
    }
  }

  private final DynamicIntArray mShortest = new DynamicIntArray();
  private List<ChainNode> mActiveChains = null;
  private int mChainLength = -1;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mShortest.get(mN) == 0) {
      if (++mChainLength == 0) {
        mActiveChains = Collections.singletonList(new ChainNode(1, null));
        return Z.ZERO;
      } else {
        final List<ChainNode> newChains = new ArrayList<>();
        for (final ChainNode c : mActiveChains) {
          final int head = c.mHead;
          ChainNode s = c;
          while (s != null && 2 * s.mHead > head) {
            final int h = s.mHead;
            for (ChainNode k = s; k != null && h + k.mHead > head; k = k.mTail) {
              final int n = h + k.mHead;
              newChains.add(new ChainNode(n, c));
              if (mShortest.get(n) == 0) {
                mShortest.set(n, mChainLength);
              }
            }
            s = s.mTail;
          }
        }
        mActiveChains = newChains;
      }
    }
    return Z.valueOf(mShortest.get(mN));
  }
}

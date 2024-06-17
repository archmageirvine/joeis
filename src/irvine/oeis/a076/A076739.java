package irvine.oeis.a076;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A076739 Number of compositions of n into Fibonacci numbers (1 counted as single Fibonacci number).
 * @author Georg Fischer
 */
public class A076739 extends AbstractSequence implements DirectSequence {

  private int mN;
  private final DirectSequence mSeq;
  private final int mSeqOffset;

  /**
   * Generic constructor with parameter
   * @param offset first index
   * @param seq sequence
   * @param seqOffset extra offset to apply to <code>seq</code>
   */
  public A076739(final int offset, final Sequence seq, final int seqOffset) {
    super(offset);
    mN = offset - 1;
    mSeq = DirectSequence.create(seq);
    mSeqOffset = seqOffset;
  }

  /**
   * Generic constructor with parameter
   * @param offset first index
   * @param seq sequence
   */
  public A076739(final int offset, final Sequence seq) {
    this(offset, seq, 0);
  }

  /** Construct the sequence. */
  public A076739() {
    this(0, new A000045(), 2);
  }

  private final MemoryFunction1<Z> mF = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      int k = 0;
      while (true) {
        final int term = mSeq.a(k + mSeqOffset).intValueExact();
        if (term > n) {
          break;
        }
        if (term > 0) {
          sum = sum.add(get(n - term));
        }
        ++k;
      }
      return sum;
    }
  };

  @Override
  public Z a(final int n) {
    return mF.get(n);
  }

  @Override
  public Z a(final Z n) {
    return mF.get(n.intValueExact());
  }

  @Override
  public Z next() {
    return mF.get(++mN);
  }
}

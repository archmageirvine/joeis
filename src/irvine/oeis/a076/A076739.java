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

  /** Construct the sequence. */
  public A076739() {
    this(0, new A000045().skip(2));
  }

  /**
   * Generic constructor with parameter
   * @param offset first index
   * @param seq sequence
   */
  public A076739(final int offset, final Sequence seq) {
    super(offset);
    mN = offset - 1;
    mSeq = DirectSequence.create(seq);
  }

  private final MemoryFunction1<Z> mF = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int k = 0, term; (term = mSeq.a(k).intValueExact()) <= n; ++k) {
        sum = sum.add(get(n - term));
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

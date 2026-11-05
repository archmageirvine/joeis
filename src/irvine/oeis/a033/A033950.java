package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectPredicate;

/**
 * A033950 Refactorable numbers: number of divisors of k divides k. Also known as tau numbers.
 * @author Sean A. Irvine
 */
public class A033950 extends AbstractSequence implements DirectPredicate {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A033950(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A033950() {
    super(1);
  }

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(Functions.SIGMA0.z(mN)).isZero()) {
        return mN;
      }
    }
  }

  @Override
  public boolean is(final Z n) {
    return n.mod(Functions.SIGMA0.z(n)).isZero();
  }

  @Override
  public boolean is(final long n) {
    return n % Functions.SIGMA0.l(n) == 0L;
  }

}

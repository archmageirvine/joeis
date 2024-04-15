package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A033950 Refactorable numbers: number of divisors of k divides k. Also known as tau numbers.
 * @author Sean A. Irvine
 */
public class A033950 extends AbstractSequence {

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
}

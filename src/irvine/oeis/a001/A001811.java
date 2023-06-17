package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001811 Coefficients of Laguerre polynomials.
 * @author Sean A. Irvine
 */
public class A001811 extends AbstractSequence {

  /* Construct the sequence. */
  public A001811() {
    super(4);
  }

  private long mN = 3;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 4) {
      mA = mA.multiply(Z.valueOf(mN).square()).divide(mN - 4);
    }
    return mA;
  }
}

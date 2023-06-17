package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001812 Coefficients of Laguerre polynomials.
 * @author Sean A. Irvine
 */
public class A001812 extends AbstractSequence {

  /** Construct the sequence. */
  public A001812() {
    super(5);
  }

  private long mN = 4;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 5) {
      mA = mA.multiply(Z.valueOf(mN).square()).divide(mN - 5);
    }
    return mA;
  }
}

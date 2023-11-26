package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A059866 Period of the continued fraction for sqrt(2^n-1).
 * @author Sean A. Irvine
 */
public class A059866 extends A003285 {

  /** Construct the sequence. */
  public A059866() {
    super(2);
  }

  private Z mA = Z.TWO;

  @Override
  public Z next() {
    mA = mA.multiply2();
    return period(mA.subtract(1));
  }
}

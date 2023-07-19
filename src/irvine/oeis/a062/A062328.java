package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A062328 Length of period of continued fraction expansion of square root of 3^n+1.
 * @author Sean A. Irvine
 */
public class A062328 extends A003285 {

  /** Construct the sequence. */
  public A062328() {
    super(0);
  }

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    return period(mA.add(1));
  }
}

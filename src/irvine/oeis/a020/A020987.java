package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020987 Zero-one version of Golay-Rudin-Shapiro sequence (or word).
 * @author Sean A. Irvine
 */
public class A020987 extends A020985 {

  @Override
  public Z next() {
    super.next();
    return mA.isSet(mN) ? Z.ZERO : Z.ONE;
  }
}

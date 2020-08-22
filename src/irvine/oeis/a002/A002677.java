package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002677 Denominators of coefficients for central differences M_{3}'^(2*n+1).
 * @author Sean A. Irvine
 */
public class A002677 extends A002672 {

  private int mN = 2;

  @Override
  public Z next() {
    mN += 2;
    return bigM(4, mN).multiply(mN).divide(4).den();
  }
}

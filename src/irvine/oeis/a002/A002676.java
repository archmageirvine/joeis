package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002676 Denominators of coefficients for central differences M_{4}^(2*n).
 * @author Sean A. Irvine
 */
public class A002676 extends A002672 {

  private int mN = 2;

  @Override
  public Z next() {
    mN += 2;
    return bigM(4, mN).den();
  }
}

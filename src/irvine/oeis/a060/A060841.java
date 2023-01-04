package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a001.A001088;

/**
 * A060841 Numerator of 1/det(M) where M is the n X n matrix with M[i,j] = 1/lcm(i,j).
 * @author Sean A. Irvine
 */
public class A060841 extends A001088 {

  private Z mF2 = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF2 = mF2.multiply(++mN).multiply(mN);
    return mF2.divide(super.next());
  }
}

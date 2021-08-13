package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050316 a(n) = A050314(2n+1,1): column 1 of triangle.
 * @author Sean A. Irvine
 */
public class A050316 extends A050314 {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return get(mN, mN, 0).coeff(1);
  }
}

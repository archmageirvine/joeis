package irvine.oeis.a012;

import irvine.math.z.Z;

/**
 * A012250 a(n) = A012249(2*n) / 2^(2*n-1).
 * @author Sean A. Irvine
 */
public class A012250 extends A012249 {

  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return a(mN).shiftRight(mN - 1);
  }
}

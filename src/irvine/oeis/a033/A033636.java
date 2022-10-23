package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033636 a(n) = (n-1)! * Product_{i=1..n-1} ((2*n)!-2*i-1).
 * @author Sean A. Irvine
 */
public class A033636 extends Sequence1 {

  private Z mF = Z.ONE;
  private Z mF2 = Z.ONE;
  private long mN = 0;
  
  @Override
  public Z next() {
    Z prod = mF;
    mF = mF.multiply(++mN);
    mF2 = mF2.multiply(2 * mN).multiply(2 * mN - 1);
    for (long k = 1; k < mN; ++k) {
      prod = prod.multiply(mF2.subtract(2 * k + 1));
    }
    return prod;
  }
}

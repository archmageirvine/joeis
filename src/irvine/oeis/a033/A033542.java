package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A033542 a(n) = 2*(n^2)!* Product_{k = 1..n-1} k!/(n+k)!.
 * @author Sean A. Irvine
 */
public class A033542 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO; // Why isn't a(0) = 2?
    }
    Z prod = Functions.FACTORIAL.z(mN * mN).multiply2();
    for (int k = 1; k < mN; ++k) {
      prod = prod.multiply(Functions.FACTORIAL.z(k));
    }
    for (int k = 1; k < mN; ++k) {
      prod = prod.divide(Functions.FACTORIAL.z(mN + k));
    }
    return prod;
  }
}

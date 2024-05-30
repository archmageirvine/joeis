package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051190 a(n) = Product_{k=1..n-1} gcd(k,n).
 * @author Sean A. Irvine
 */
public class A051190 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 2; k < mN; ++k) {
      prod = prod.multiply(Functions.GCD.l(mN, k));
    }
    return prod;
  }
}

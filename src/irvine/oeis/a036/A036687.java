package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036687 a(n) = Product_{i=0..n} (3*i+1)! / (n+i)!.
 * @author Sean A. Irvine
 */
public class A036687 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      prod = prod.multiply(Functions.FACTORIAL.z(3 * k + 1));
    }
    for (int k = 0; k <= mN; ++k) {
      prod = prod.divide(Functions.FACTORIAL.z(mN + k));
    }
    return prod;
  }
}

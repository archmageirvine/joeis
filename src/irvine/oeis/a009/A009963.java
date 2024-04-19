package irvine.oeis.a009;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009963 Triangle of numbers n!(n-1)!...(n-k+1)!/(1!2!...k!).
 * @author Sean A. Irvine
 */
public class A009963 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    Z prod = Z.ONE;
    for (int k = 1; k <= mM; ++k) {
      prod = prod.multiply(Functions.FACTORIAL.z(mN + 1 - k)).divide(Functions.FACTORIAL.z(k));
    }
    return prod;
  }
}

package irvine.oeis.a039;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A039622 Number of n X n Young tableaux.
 * @author Sean A. Irvine
 */
public class A039622 extends Sequence0 {


  private int mN = -1;

  @Override
  public Z next() {
    final int n = ++mN * mN;
    Z prod = Functions.FACTORIAL.z(n);
    for (int k = 0; k < mN; ++k) {
      prod = prod.multiply(Functions.FACTORIAL.z(k)).divide(Functions.FACTORIAL.z(mN + k));
    }
    return prod;
  }
}

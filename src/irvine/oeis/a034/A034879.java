package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A034879 a(n) = product of factorials of digits of a(n-1).
 * @author Sean A. Irvine
 */
public class A034879 extends Sequence1 {

  private Z mA = null;

  private Z factorialDigitProduct(final Z f) {
    final int[] cnts = ZUtils.digitCounts(f);
    Z prod = Z.ONE;
    for (int k = 0; k < cnts.length; ++k) {
      prod = prod.multiply(Functions.FACTORIAL.z(k).pow(cnts[k]));
    }
    return prod;
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : factorialDigitProduct(mA);
    return mA;
  }
}

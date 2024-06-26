package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063108 a(1) = 1; thereafter a(n+1) = a(n) + product of nonzero digits of a(n).
 * @author Sean A. Irvine
 */
public class A063108 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(Functions.DIGIT_NZ_PRODUCT.z(10, mA));
    return mA;
  }
}

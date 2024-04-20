package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005266 a(1)=3, b(n) = Product_{k=1..n} a(k), a(n+1) is the largest prime factor of (b(n)-1).
 * @author Sean A. Irvine
 */
public class A005266 extends Sequence1 {

  private Z mProd = Z.ONE;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : Functions.GPF.z(mProd.subtract(1));
    mProd = mProd.multiply(mA);
    return mA;
  }
}

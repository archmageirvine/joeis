package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064819 a(n) = p(1)*p(2)*...*p(n) - p(n+1)^2, where p(i) = i-th prime.
 * @author Sean A. Irvine
 */
public class A064819 extends A000040 {

  private Z mProd = super.next();

  @Override
  public Z next() {
    final Z p = super.next();
    final Z res = mProd.subtract(p.square());
    mProd = mProd.multiply(p);
    return res;
  }
}

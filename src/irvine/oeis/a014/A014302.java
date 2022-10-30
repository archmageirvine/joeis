package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A014302 a(n) = prime(n)*(prime(n-1)-1)/2.
 * @author Sean A. Irvine
 */
public class A014302 extends A065091 {

  {
    setOffset(3);
  }

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z res = t.multiply(mA.subtract(1)).divide2();
    mA = t;
    return res;
  }
}


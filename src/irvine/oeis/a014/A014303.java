package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014303 <code>a(n) = prime(n)*(prime(n+1)-1)/2</code>.
 * @author Sean A. Irvine
 */
public class A014303 extends A000040 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z res = mA.multiply(t.subtract(1)).divide2();
    mA = t;
    return res;
  }
}


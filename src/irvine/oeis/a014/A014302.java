package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014302.
 * @author Sean A. Irvine
 */
public class A014302 extends A000040 {

  {
    super.next(); // skip 2
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


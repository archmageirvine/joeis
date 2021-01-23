package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a007.A007088;

/**
 * A020767 Product_{k=1..n} b(k), where b(k) = binary expansion of k (A007088) but read as if it were a decimal number.
 * @author Sean A. Irvine
 */
public class A020767 extends A007088 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    if (!t.isZero()) {
      mA = mA.multiply(t);
    }
    return mA;
  }
}

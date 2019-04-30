package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a007.A007088;

/**
 * A020767 <code>Product_{k=1..n} b(k)</code>, where <code>b(k) =</code> binary expansion of k (A007088) but read as if it were a decimal number.
 * @author Sean A. Irvine
 */
public class A020767 extends A007088 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    if (!Z.ZERO.equals(t)) {
      mA = mA.multiply(t);
    }
    return mA;
  }
}

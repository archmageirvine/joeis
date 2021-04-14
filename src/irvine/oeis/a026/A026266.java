package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026266 a(n) = (1/2)*s(n), where s = A026262.
 * @author Sean A. Irvine
 */
public class A026266 extends A026262 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isOdd());
    return t.divide2();
  }
}

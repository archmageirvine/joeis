package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026266 <code>a(n) = (1/2)*s(n)</code>, where s <code>= A026262</code>.
 * @author Sean A. Irvine
 */
public class A026266 extends A026262 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (!t.isEven());
    return t.divide2();
  }
}

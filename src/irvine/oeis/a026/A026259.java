package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026259 <code>a(n) = (1/2)*s(n)</code>, where <code>s(n)</code> is the n-th even number in <code>A026255</code>.
 * @author Sean A. Irvine
 */
public class A026259 extends A026255 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (!t.isEven());
    return t.divide2();
  }
}

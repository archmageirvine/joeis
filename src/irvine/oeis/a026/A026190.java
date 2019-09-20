package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026190 <code>a(n) = (1/2)*s(n)</code>, where <code>s(n)</code> is the n-th even number in <code>A026142</code>.
 * @author Sean A. Irvine
 */
public class A026190 extends A026142 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (!t.isEven());
    return t.divide2();
  }
}

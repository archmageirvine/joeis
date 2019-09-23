package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026253 <code>a(n) = (1/2)*s(n)</code>, where <code>s(n)</code> is the n-th even number in <code>A026250</code>. Also <code>a(n) =</code> position of n in <code>A026253</code>.
 * @author Sean A. Irvine
 */
public class A026253 extends A026250 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (!t.isEven());
    return t.divide2();
  }
}

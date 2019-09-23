package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026252 <code>a(n) = (1/2)*(s(n) + 1)</code>, where <code>s(n)</code> is the n-th odd number in <code>A026250</code>. Also <code>a(n) =</code> position of n in <code>A026252</code>.
 * @author Sean A. Irvine
 */
public class A026252 extends A026250 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t.add(1).divide2();
  }
}

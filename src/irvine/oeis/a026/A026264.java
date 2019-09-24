package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026264 <code>(1/2)*(s(n) + 1)</code>, where <code>s(n)</code> is the n-th odd number in <code>A026262</code>.
 * @author Sean A. Irvine
 */
public class A026264 extends A026262 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t.add(1).divide2();
  }
}

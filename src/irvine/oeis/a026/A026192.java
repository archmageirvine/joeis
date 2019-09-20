package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026192 <code>(1/3)*s(n)</code>, where <code>s(n)</code> is the n-th multiple of 3 in <code>A026142</code>.
 * @author Sean A. Irvine
 */
public class A026192 extends A026142 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(3) != 0);
    return t.divide(3);
  }
}

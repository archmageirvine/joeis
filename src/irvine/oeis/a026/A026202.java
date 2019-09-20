package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026202 <code>a(n) = (1/4)*s(n)</code>, where <code>s(n)</code> is the n-th multiple of 4 in <code>A026166</code>.
 * @author Sean A. Irvine
 */
public class A026202 extends A026166 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(4) != 0);
    return t.divide(4);
  }
}

package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026200 <code>a(n) = (1/3)*s(n)</code>, where <code>s(n)</code> is the n-th multiple of 3 in <code>A026166</code>.
 * @author Sean A. Irvine
 */
public class A026200 extends A026166 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(3) != 1);
    return t.add(2).divide(3);
  }
}

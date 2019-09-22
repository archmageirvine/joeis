package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026212.
 * @author Sean A. Irvine
 */
public class A026212 extends A026172 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(5) != 0);
    return t.divide(5);
  }
}

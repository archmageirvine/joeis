package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026208.
 * @author Sean A. Irvine
 */
public class A026208 extends A026172 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(3) != 0);
    return t.divide(3);
  }
}

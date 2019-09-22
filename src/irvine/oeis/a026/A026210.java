package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026210.
 * @author Sean A. Irvine
 */
public class A026210 extends A026172 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(3) != 1);
    return t.add(2).divide(3);
  }
}

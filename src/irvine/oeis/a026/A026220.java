package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026220.
 * @author Sean A. Irvine
 */
public class A026220 extends A026177 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(5) != 0);
    return t.divide(5);
  }
}

package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026218.
 * @author Sean A. Irvine
 */
public class A026218 extends A026177 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(3) != 1);
    return t.add(2).divide(3);
  }
}

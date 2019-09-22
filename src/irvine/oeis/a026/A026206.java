package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026206.
 * @author Sean A. Irvine
 */
public class A026206 extends A026172 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t.add(1).divide2();
  }
}

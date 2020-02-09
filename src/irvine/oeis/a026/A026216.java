package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026216 Duplicate of <code>A026177</code>.
 * @author Sean A. Irvine
 */
public class A026216 extends A026177 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(3) != 0);
    return t.divide(3);
  }
}

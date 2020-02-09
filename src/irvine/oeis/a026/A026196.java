package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026196 Duplicate of <code>A026177</code>.
 * @author Sean A. Irvine
 */
public class A026196 extends A026142 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(5) != 0);
    return t.divide(5);
  }
}

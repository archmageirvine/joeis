package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026212 Duplicate of <code>A026188</code>.
 * @author Sean A. Irvine
 */
public class A026212 extends A026136 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(5) != 0);
    return t.divide(5);
  }
}

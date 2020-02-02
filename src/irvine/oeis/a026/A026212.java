package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026212 <code>a(n) = (1/5)*s(n)</code>, where <code>s(n)</code> is the n-th multiple of 5 in <code>A026136</code>.
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

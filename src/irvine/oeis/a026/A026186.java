package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026186 <code>a(n) = (1/3)*(s(n) + 2)</code>, where <code>s(n)</code> is the n-th number congruent to <code>1 mod 3</code> in <code>A026136</code>.
 * @author Sean A. Irvine
 */
public class A026186 extends A026136 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(3) != 1);
    return t.add(2).divide(3);
  }
}

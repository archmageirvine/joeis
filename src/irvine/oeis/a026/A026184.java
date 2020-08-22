package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026184 a(n) = (1/3)*s(n), where s(n) is the n-th multiple of 3 in A026136.
 * @author Sean A. Irvine
 */
public class A026184 extends A026136 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(3) != 0);
    return t.divide(3);
  }
}

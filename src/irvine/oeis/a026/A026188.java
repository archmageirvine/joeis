package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026188 a(n) = (1/5)*s(n), where s(n) is the n-th multiple of 5 in A026136.
 * @author Sean A. Irvine
 */
public class A026188 extends A026136 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(5) != 0);
    return t.divide(5);
  }
}

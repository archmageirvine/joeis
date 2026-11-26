package irvine.oeis.a334;

import irvine.math.z.Z;
import irvine.oeis.a335.A335000;

/**
 * A334884 Order of the non-isomorphic groups PSL(m,q) [or PSL_m(q)] in increasing order as q runs through the prime powers.
 * @author Gregory Morse
 */
public class A334884 extends A335000 {

  @Override
  protected boolean accept(final int degree, final Z q) {
    return !(degree == 2 && Z.FIVE.equals(q) || degree == 3 && Z.TWO.equals(q));
  }
}

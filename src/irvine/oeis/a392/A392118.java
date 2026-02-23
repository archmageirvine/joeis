package irvine.oeis.a392;

import irvine.math.z.Z;

/**
 * A392118 Upper Wythoff partition sequence of the primes; see A392117.
 * @author Sean A. Irvine
 */
public class A392118 extends A392117 {

  @Override
  protected Z select(final Z lower, final Z upper, final int lowerIndex, final int upperIndex) {
    return upper;
  }
}

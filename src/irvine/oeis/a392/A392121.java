package irvine.oeis.a392;

import irvine.math.z.Z;

/**
 * A392121 Indices of the upper Wythoff partition sequence of the primes; see A392117.
 * @author Sean A. Irvine
 */
public class A392121 extends A392117 {

  @Override
  protected Z select(final Z lower, final Z upper, final int lowerIndex, final int upperIndex) {
    return Z.valueOf(upperIndex);
  }
}

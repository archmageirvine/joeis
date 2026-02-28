package irvine.oeis.a392;

import irvine.math.z.Z;

/**
 * A392657 Upper Wythoff partition sequence of the squares; see A392656.
 * @author Sean A. Irvine
 */
public class A392657 extends A392656 {

  @Override
  protected Z select(final Z lower, final Z upper, final int lowerIndex, final int upperIndex) {
    return upper;
  }
}

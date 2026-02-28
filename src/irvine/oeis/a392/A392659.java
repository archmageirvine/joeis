package irvine.oeis.a392;

import irvine.math.z.Z;

/**
 * A392659 Indices of the upper Wythoff partition sequence of the squares; see A392656.
 * @author Sean A. Irvine
 */
public class A392659 extends A392656 {

  @Override
  protected Z select(final Z lower, final Z upper, final int lowerIndex, final int upperIndex) {
    return Z.valueOf(upperIndex);
  }
}

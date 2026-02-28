package irvine.oeis.a392;

import irvine.math.z.Z;

/**
 * A392658 Indices of the lower Wythoff partition sequence of the squares; see A392657.
 * @author Sean A. Irvine
 */
public class A392658 extends A392656 {

  @Override
  protected Z select(final Z lower, final Z upper, final int lowerIndex, final int upperIndex) {
    return Z.valueOf(lowerIndex);
  }
}

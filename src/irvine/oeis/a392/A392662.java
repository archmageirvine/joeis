package irvine.oeis.a392;

import irvine.math.z.Z;

/**
 * A392662 Indices of the lower Wythoff partition sequence of the triangular numbers; see A392660.
 * @author Sean A. Irvine
 */
public class A392662 extends A392660 {

  @Override
  protected Z select(final Z lower, final Z upper, final int lowerIndex, final int upperIndex) {
    return Z.valueOf(lowerIndex);
  }
}

package irvine.oeis.a392;

import irvine.math.z.Z;

/**
 * A392661 Upper Wythoff partition sequence of the triangular numbers (A003086); see A392660.
 * @author Sean A. Irvine
 */
public class A392661 extends A392660 {

  @Override
  protected Z select(final Z lower, final Z upper, final int lowerIndex, final int upperIndex) {
    return upper;
  }
}

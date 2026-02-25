package irvine.oeis.a392;

import irvine.math.z.Z;

/**
 * A392661 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A392661 extends A392660 {

  @Override
  protected Z select(final Z lower, final Z upper, final int lowerIndex, final int upperIndex) {
    return upper;
  }
}

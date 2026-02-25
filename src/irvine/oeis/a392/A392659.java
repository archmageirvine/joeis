package irvine.oeis.a392;

import irvine.math.z.Z;

/**
 * A392659 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A392659 extends A392656 {

  @Override
  protected Z select(final Z lower, final Z upper, final int lowerIndex, final int upperIndex) {
    return Z.valueOf(upperIndex);
  }
}

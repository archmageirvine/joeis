package irvine.oeis.a392;

import irvine.math.z.Z;

/**
 * A392118 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A392118 extends A392117 {

  @Override
  protected Z select(final Z lower, final Z upper) {
    return upper;
  }
}

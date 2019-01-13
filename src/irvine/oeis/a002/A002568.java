package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002568.
 * @author Sean A. Irvine
 */
public class A002568 extends A002564 {

  @Override
  protected boolean acceptable(final Z state, final int position) {
    return state.and(mPositions[position]).signum() == 0;
  }
}

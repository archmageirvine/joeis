package irvine.math.predicate;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Test if a number is a strong pseudoprime.
 * @author Sean A. Irvine
 */
class StrongPseudoprime extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 2;
  }

  @Override
  public boolean is(final long base, final Z n) {
    return ZUtils.sprpTest(Z.valueOf(base), n);
  }
}

package irvine.math.function;

import irvine.math.z.Z;

/**
 * Ceiling cube root.
 * @author Sean A. Irvine
 */
class CeilCubeRoot extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    final Z s = n.root(3);
    return s.auxiliary() == 1 ? s : s.add(1);
  }
}

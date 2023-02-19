package irvine.oeis.a061;

import java.util.Set;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A061499 Integer part of geometric mean of distinct numbers that can be formed from the nonzero digits of n.
 * @author Sean A. Irvine
 */
public class A061499 extends A061497 {

  @Override
  protected Z select(final Set<Z> set) {
    return ZUtils.product(set).root(set.size());
  }
}


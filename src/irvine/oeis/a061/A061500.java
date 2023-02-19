package irvine.oeis.a061;

import java.util.Set;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A061500 Integer part of arithmetic mean of distinct numbers that can be formed from the nonzero digits of n.
 * @author Sean A. Irvine
 */
public class A061500 extends A061497 {

  @Override
  protected Z select(final Set<Z> set) {
    return ZUtils.sum(set).divide(set.size());
  }
}

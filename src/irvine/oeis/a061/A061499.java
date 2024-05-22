package irvine.oeis.a061;

import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A061499 Integer part of geometric mean of the distinct nonzero numbers that can be formed from the digits of n.
 * @author Sean A. Irvine
 */
public class A061499 extends A061497 {

  @Override
  protected Z select(final Set<Z> set) {
    return Functions.PRODUCT.z(set).root(set.size());
  }
}


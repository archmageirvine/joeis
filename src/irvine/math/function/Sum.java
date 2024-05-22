package irvine.math.function;

import java.util.Collection;

import irvine.math.z.Z;

/**
 * Sum of the values.
 * @author Sean A. Irvine
 */
class Sum extends AbstractFunctionN {

  @Override
  public Z z(final Collection<Z> values) {
    Z sum = Z.ZERO;
    for (final Z v : values) {
      sum = sum.add(v);
    }
    return sum;
  }

  @Override
  public Z z(final Z... values) {
    Z sum = Z.ZERO;
    for (final Z v : values) {
      sum = sum.add(v);
    }
    return sum;
  }

  @Override
  public Z z(final long... values) {
    Z sum = Z.ZERO;
    for (final long v : values) {
      sum = sum.add(v);
    }
    return sum;
  }

  @Override
  public long l(final int... values) {
    long m = 0;
    for (final int v : values) {
      m += v;
    }
    return m;
  }
}

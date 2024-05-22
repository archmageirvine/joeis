package irvine.math.function;

import java.util.Collection;

import irvine.math.z.Z;

/**
 * Maximum of the values.
 * @author Sean A. Irvine
 */
class Max extends AbstractFunctionN {

  @Override
  public Z z(final Collection<Z> s) {
    Z m = null;
    for (final Z z : s) {
      if (m == null || z.compareTo(m) > 0) {
        m = z;
      }
    }
    return m;
  }

  @Override
  public Z z(final Z... values) {
    if (values == null || values.length == 0) {
      return null;
    }
    Z m = values[0];
    for (int k = 1; k < values.length; ++k) {
      if (values[k].compareTo(m) > 0) {
        m = values[k];
      }
    }
    return m;
  }

  @Override
  public long l(final long... values) {
    long m = Long.MIN_VALUE;
    for (final long v : values) {
      if (v > m) {
        m = v;
      }
    }
    return m;
  }

  @Override
  public int i(final int... values) {
    int m = Integer.MIN_VALUE;
    for (final int v : values) {
      if (v > m) {
        m = v;
      }
    }
    return m;
  }
}

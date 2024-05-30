package irvine.math.function;

import java.util.Collection;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;

/**
 * Abstract implementations for functions supporting both two aguments
 * and a set of values.
 * @author Sean A. Irvine
 */
public abstract class AbstractFunction2N extends AbstractFunction2 implements FunctionN {

  @Override
  public Z z(final Collection<Z> values) {
    return z(values.toArray(new Z[0]));
  }

  @Override
  public Z z(final Z... values) {
    if (values == null || values.length == 0) {
      return Z.ONE; // appropriate for gcd and lcm
    }
    Z res = values[0];
    for (int k = 1; k < values.length; ++k) {
      res = z(res, values[k]);
    }
    return res;
  }

  @Override
  public Z z(final long... values) {
    return Z.valueOf(l(values));
  }

  @Override
  public Z z(final int... values) {
    return Z.valueOf(i(values));
  }

  @Override
  public long l(final Z... values) {
    return z(values).longValueExact();
  }

  @Override
  public long l(final long... values) {
    if (values == null || values.length == 0) {
      return 1; // appropriate for gcd and lcm
    }
    long res = values[0];
    for (int k = 1; k < values.length; ++k) {
      res = l(res, values[k]);
    }
    return res;
  }

  @Override
  public long l(final int... values) {
    return l(IntegerUtils.toLong(values));
  }

  @Override
  public int i(final Z... values) {
    return z(values).intValueExact();
  }

  @Override
  public int i(final long... values) {
    return z(values).intValueExact();
  }

  @Override
  public int i(final int... values) {
    return i(IntegerUtils.toLong(values));
  }
}

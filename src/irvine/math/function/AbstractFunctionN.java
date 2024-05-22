package irvine.math.function;

import java.util.Collection;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Default implementation of all function methods.
 * Classes extending this, must implement at least one of the <code>z(n)</code> methods.
 * @author Sean A. Irvine
 */
public abstract class AbstractFunctionN implements FunctionN {

  @Override
  public Z z(final Collection<Z> values) {
    return z(values.toArray(new Z[0]));
  }

  @Override
  public Z z(final Z... values) {
    return z(ZUtils.toLong(values));
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
    return z(values).longValueExact();
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

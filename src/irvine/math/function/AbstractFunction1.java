package irvine.math.function;

import irvine.math.z.Z;

/**
 * Default implementation of all function methods.
 * Classes extending this, must implement at least one of the <code>z(n)</code> methods.
 * @author Sean A. Irvine
 */
public abstract class AbstractFunction1 implements Function1 {

  @Override
  public Z z(final Z n) {
    return z(n.longValueExact());
  }

  @Override
  public Z z(final long n) {
    return z(Z.valueOf(n));
  }

  @Override
  public Z z(final int n) {
    return z((long) n);
  }

  @Override
  public long l(final Z n) {
    return z(n).longValueExact();
  }

  @Override
  public long l(final long n) {
    return z(n).longValueExact();
  }

  @Override
  public long l(final int n) {
    return l((long) n);
  }

  @Override
  public int i(final Z n) {
    return z(n).intValueExact();
  }

  @Override
  public int i(final long n) {
    return z(n).intValueExact();
  }

  @Override
  public int i(final int n) {
    return i((long) n);
  }
}

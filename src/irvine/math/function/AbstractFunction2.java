package irvine.math.function;

import irvine.math.z.Z;

/**
 * Default implementation of all function methods including single
 * parameter versions of the function.
 * Classes extending this, must implement at least one of the <code>z(n, m)</code> methods.
 * @author Sean A. Irvine
 */
public abstract class AbstractFunction2 implements Function2 {

  @Override
  public Z z(final Z n, final Z m) {
    return z(n.longValueExact(), m.longValueExact());
  }

  @Override
  public Z z(final long n, final Z m) {
    return z(Z.valueOf(n), m);
  }

  @Override
  public Z z(final Z n, final long m) {
    return z(n, Z.valueOf(m));
  }

  @Override
  public Z z(final long n, final long m) {
    return z(Z.valueOf(n), Z.valueOf(m));
  }

  @Override
  public long l(final Z n, final Z m) {
    return z(n.longValueExact(), m.longValueExact()).longValueExact();
  }

  @Override
  public long l(final long n, final Z m) {
    return l(n, m.longValueExact());
  }

  @Override
  public long l(final Z n, final long m) {
    return l(n.longValueExact(), m);
  }

  @Override
  public long l(final long n, final long m) {
    return l(Z.valueOf(n), Z.valueOf(m));
  }

  @Override
  public int i(final Z n, final Z m) {
    return z(n.longValueExact(), m.longValueExact()).intValueExact();
  }

  @Override
  public int i(final long n, final Z m) {
    return i(n, m.longValueExact());
  }

  @Override
  public int i(final Z n, final long m) {
    return i(n.longValueExact(), m);
  }

  @Override
  public int i(final long n, final long m) {
    return i(Z.valueOf(n), Z.valueOf(m));
  }
}

package irvine.math.function;

import irvine.math.z.Z;

/**
 * Default implementation of all function methods including single
 * parameter versions of the function.
 * Classes extending this, must implement at least one of the <code>z(t, n)</code> methods.
 * @author Sean A. Irvine
 */
public abstract class AbstractFunction2 implements Function2 {

  @Override
  public Z z(final long t, final Z n) {
    return z(t, n.longValueExact());
  }

  @Override
  public Z z(final long t, final long n) {
    return z(t, Z.valueOf(n));
  }

  @Override
  public long l(final long t, final Z n) {
    return z(t, n).longValueExact();
  }

  @Override
  public long l(final long t, final long n) {
    return z(t, n).longValueExact();
  }

  @Override
  public int i(final long t, final Z n) {
    return z(t, n).intValueExact();
  }

  @Override
  public int i(final long t, final long n) {
    return z(t, n).intValueExact();
  }

  // For maximum efficiency override all the 1-parameter forms, passing
  // the default first parameter through in each case.
  @Override
  public Z z(final Z n) {
    return z(getDefault(), n);
  }

  @Override
  public Z z(final long n) {
    return z(getDefault(), n);
  }

  @Override
  public Z z(final int n) {
    return z(getDefault(), n);
  }

  @Override
  public long l(final Z n) {
    return l(getDefault(), n);
  }

  @Override
  public long l(final long n) {
    return l(getDefault(), n);
  }

  @Override
  public long l(final int n) {
    return l(getDefault(), n);
  }

  @Override
  public int i(final Z n) {
    return i(getDefault(), n);
  }

  @Override
  public int i(final long n) {
    return i(getDefault(), n);
  }

  @Override
  public int i(final int n) {
    return i(getDefault(), n);
  }
}

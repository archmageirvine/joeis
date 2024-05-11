package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Default implementation of all predicate methods including single
 * parameter versions of the predicate.
 * Classes extending this, must implement at least one of the <code>is(t, n)</code> methods.
 * @author Sean A. Irvine
 */
public abstract class AbstractPredicate2 implements Predicate2 {

  @Override
  public boolean is(final long t, final Z n) {
    return is(t, n.longValueExact());
  }

  @Override
  public boolean is(final long t, final long n) {
    return is(t, Z.valueOf(n));
  }

  // For maximum efficiency override all the 1-parameter forms, passing
  // the default first parameter through in each case.
  @Override
  public boolean is(final Z n) {
    return is(getDefault(), n);
  }

  @Override
  public boolean is(final long n) {
    return is(getDefault(), n);
  }

  @Override
  public boolean is(final int n) {
    return is(getDefault(), n);
  }
}

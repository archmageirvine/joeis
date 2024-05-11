package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Default implementation of all predicate methods.
 * Classes extending this, must implement at least one of the <code>is(n)</code> methods.
 * @author Sean A. Irvine
 */
public abstract class AbstractPredicate implements Predicate {

  @Override
  public boolean is(final Z n) {
    return is(n.longValueExact());
  }

  @Override
  public boolean is(final long n) {
    return is(Z.valueOf(n));
  }

  @Override
  public boolean is(final int n) {
    return is(Z.valueOf(n));
  }
}

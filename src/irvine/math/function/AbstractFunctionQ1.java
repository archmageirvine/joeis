package irvine.math.function;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Default implementation of all function methods.
 * Classes extending this, must implement at least one of the <code>q(n)</code> methods.
 * @author Sean A. Irvine
 */
public abstract class AbstractFunctionQ1 implements FunctionQ1 {

  @Override
  public Q q(final Z n) {
    return q(n.longValueExact());
  }

  @Override
  public Q q(final long n) {
    return q(Z.valueOf(n));
  }

  @Override
  public Q q(final int n) {
    return q((long) n);
  }
}

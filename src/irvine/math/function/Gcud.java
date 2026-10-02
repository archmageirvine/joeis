package irvine.math.function;

import java.util.Set;
import java.util.TreeSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;

/**
 * Greatest common unitary divisor.
 * @author Sean A. Irvine
 */
class Gcud extends AbstractFunction2 {

  @Override
  public Z z(final long n, final long m) {
    final Set<Z> s0 = new TreeSet<>(FactorUtils.unitaryDivisors(n));
    final Set<Z> s1 = new TreeSet<>(FactorUtils.unitaryDivisors(m));
    s1.retainAll(s0);
    return Functions.MAX.z(s1);
  }
}

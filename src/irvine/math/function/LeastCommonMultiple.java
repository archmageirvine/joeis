package irvine.math.function;

import irvine.math.z.Z;

/**
 * Least common multiple function.
 * @author Sean A. Irvine
 */
public class LeastCommonMultiple extends AbstractFunction2N {

  @Override
  public Z z(final Z n, final Z m) {
    return n.lcm(m);
  }

  @Override
  public Z z(final long n, final long m) {
    return Z.valueOf(l(n, m));
  }

  @Override
  public long l(final long n, final long m) {
    return n == 0 ? 0 : (n / Functions.GCD.l(n, m)) * m;
  }
}

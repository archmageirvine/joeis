package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000720;

/**
 * A033270 Number of odd primes &lt;= n.
 * @author Sean A. Irvine
 */
public class A033270 extends A000720 implements DirectSequence {

  @Override
  public Z next() {
    return Z.ZERO.max(super.next().subtract(1));
  }

  @Override
  public Z a(final Z n) {
    return Functions.MAX.z(Z.ZERO, Functions.PRIME_PI.z(n).subtract(1));
  }

  @Override
  public Z a(final long n) {
    return Functions.MAX.z(Z.ZERO, Functions.PRIME_PI.z(n).subtract(1));
  }

}


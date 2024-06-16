package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A008836 Liouville's function lambda(n) = (-1)^k, where k is number of primes dividing n (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A008836 extends Sequence1 implements DirectSequence {

  protected long mN = 0;

  @Override
  public Z next() {
    return Functions.LIOUVILLE_LAMBDA.z(++mN);
  }

  @Override
  public Z a(final int n) {
    return Functions.LIOUVILLE_LAMBDA.z(n);
  }

  @Override
  public Z a(final Z n) {
    return Functions.LIOUVILLE_LAMBDA.z(n);
  }
}

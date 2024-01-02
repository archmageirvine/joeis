package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
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
    return Z.valueOf(Jaguar.factor(++mN).lambda());
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(Jaguar.factor(n).lambda());
  }

  @Override
  public Z a(final Z n) {
    return Z.valueOf(Jaguar.factor(n).lambda());
  }
}

package irvine.oeis.a054;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054772 Triangle T(n,k) of n X n binary matrices with k=0..n^2 ones, up to rotational symmetry.
 * @author Sean A. Irvine
 */
public class A054772 implements Sequence {

  private int mN = 0;
  private int mM = -1;

  private CycleIndex g(final int n) {
    final long n2 = n * (long) n;
    if ((n & 1) == 0) {
      return new CycleIndex("G(" + n + ")",
        MultivariateMonomial.create(1, n2, Q.ONE_QUARTER),
        MultivariateMonomial.create(2, n2 / 2, Q.ONE_QUARTER),
        MultivariateMonomial.create(4, n2 / 4, Q.HALF));
    } else {
      final CycleIndex ci = new CycleIndex("G(" + n + ")",
        MultivariateMonomial.create(1, n2 - 1, Q.ONE_QUARTER),
        MultivariateMonomial.create(2, (n2 - 1) / 2, Q.ONE_QUARTER),
        MultivariateMonomial.create(4, (n2 - 1) / 4, Q.HALF));
      return ci.multiply(MultivariateMonomial.create(1, 1));
    }
  }

  @Override
  public Z next() {
    if (++mM > mN * mN) {
      ++mN;
      mM = 0;
    }
    return g(mN).applyOnePlusXToTheN(mM).coeff(mM).toZ();
  }
}

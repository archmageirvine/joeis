package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068026 Z(S_m; sigma[1](n), sigma[2](n),..., sigma[m](n)) where Z(S_m; x_1,x_2,...,x_m) is the cycle index of the symmetric group S_m and sigma[k](n) is the sum of k-th powers of divisors of n; m=9.
 * @author Sean A. Irvine
 */
public class A068026 extends Sequence1 {

  private final CycleIndex mCycleIndex;
  private final Z[] mSigmas;
  private long mN = 0;

  protected A068026(final int degree) {
    mCycleIndex = SymmetricGroup.create(degree).cycleIndex();
    mSigmas = new Z[degree];
  }

  /** Construct the sequence. */
  public A068026() {
    this(9);
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    for (int k = 0; k < mSigmas.length; ++k) {
      mSigmas[k] = fs.sigma(k + 1);
    }
    return mCycleIndex.apply(mSigmas).toZ();
  }
}


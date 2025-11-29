package irvine.oeis.a390;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390842 3-valuation of Product_{1 &lt;= k &lt;= n} (prime(k) + 1) / (prime(k+1) - prime(k)).
 * @author Sean A. Irvine
 */
public class A390842 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private long mP = 1;
  private final long mValuation;
  private Z mProd = Z.ONE;

  protected A390842(final int val) {
    mValuation = val;
  }

  /** Construct the sequence. */
  public A390842() {
    this(3);
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mP = mPrime.nextPrime(mP);
      mProd = mProd.multiply(mP + 1).divide(mPrime.nextPrime(mP) - mP);
    }
    return Functions.VALUATION.z(mProd, mValuation);
  }
}

package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A066075 Number of solutions x to prime(n) = sigma(x) - 1, where prime(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A066075 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  protected long mP = 1;
  private long mM = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (mM <= mP) {
      mA.increment(Functions.SIGMA.i(mM) - 1);
      ++mM;
    }
    return Z.valueOf(mA.get(mP));
  }
}

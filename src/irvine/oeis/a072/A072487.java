package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A072487 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA.multiply(mPrime.isPrime(++mN) ? mN : mN / Functions.LPF.l(mN));
    return mA;
  }
}


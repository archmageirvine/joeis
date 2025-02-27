package irvine.oeis.a075;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075572 Smallest prime divisor of sum of three successive terms pertaining to A075571.
 * @author Sean A. Irvine
 */
public class A075572 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private long mA = 3;
  private long mB = 5;

  @Override
  public Z next() {
    long p = 5;
    while (true) {
      p = mPrime.nextPrime(p);
      final long s = mA + mB + p;
      if (!mPrime.isPrime(s) && mUsed.add(p)) {
        mA = mB;
        mB = p;
        return Functions.LPF.z(s);
      }
    }
  }
}


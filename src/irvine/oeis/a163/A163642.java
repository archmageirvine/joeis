package irvine.oeis.a163;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashSet;

/**
 * A163642 a(n) = the smallest composite positive integer that is not yet in the sequence and that is coprime to n.
 * @author Sean A. Irvine
 */
public class A163642 implements Sequence {

  private long mN = 0;
  private final HashSet<Z> mSeen = new HashSet<>();
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    ++mN;
    long k = 3;
    while (true) {
      if (!mPrime.isPrime(++k) && LongUtils.gcd(mN, k) == 1) {
        final Z u = Z.valueOf(k);
        if (mSeen.add(u)) {
          return u;
        }
      }
    }
  }
}


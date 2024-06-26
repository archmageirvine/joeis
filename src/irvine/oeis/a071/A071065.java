package irvine.oeis.a071;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071065 A permutation of natural numbers: a(1)=2 a(n) is the smallest integer different from a(1), a(2), a(3), ..., a(n-1) such that a(n)+n is prime.
 * @author Sean A. Irvine
 */
public class A071065 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mSeen = new HashSet<>();

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(2L);
      return Z.TWO;
    } else {
      final int n = mSeen.size() + 1;
      long p = n;
      while (true) {
        p = mPrime.nextPrime(p);
        if (mSeen.add(p - n)) {
          return Z.valueOf(p - n);
        }
      }
    }
  }
}

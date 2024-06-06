package irvine.oeis.a070;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070230 Let S_n ={p_n + q : p_n is the n-th odd prime and q runs through odd primes not greater than p_n}; sequence gives size of S_n intersect S_(n+1).
 * @author Sean A. Irvine
 */
public class A070230 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 3;
  private Set<Long> mS = Collections.emptySet();

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long cnt = 0;
    final Set<Long> set = new HashSet<>();
    for (long q = 3; q <= mP; q = mPrime.nextPrime(q)) {
      set.add(mP + q);
      if (mS.contains(mP + q)) {
        ++cnt;
      }
    }
    mS = set;
    return Z.valueOf(cnt);
  }
}


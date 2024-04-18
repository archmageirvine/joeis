package irvine.oeis.a063;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063100 Compute the cototient function for the g(n) = p(n+1)-p(n)-1 composite numbers between two consecutive primes. Let the number of distinct cototient values be c(n). Then, a(n) = g(n)-c(n).
 * @author Sean A. Irvine
 */
public class A063100 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    final Set<Long> cototients = new HashSet<>();
    long c = 0;
    while (!mPrime.isPrime(++mN)) {
      ++c;
      cototients.add(mN - Functions.PHI.l(mN));
    }
    return Z.valueOf(c - cototients.size());
  }
}

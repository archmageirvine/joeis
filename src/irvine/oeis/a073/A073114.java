package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A073114 Number of permutations p of [n] such that 1*p(1) + 2*p(2) + 3*p(3) + ... + n*p(n) is prime.
 * @author Sean A. Irvine
 */
public class A073114 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    final Permutation perm = new Permutation(++mN);
    int[] p;
    long cnt = 0;
    while ((p = perm.next()) != null) {
      long s = 0;
      for (int k = 0; k < p.length; ++k) {
        s += (long) (k + 1) * (p[k] + 1);
      }
      if (mPrime.isPrime(s)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A073083.
 * @author Sean A. Irvine
 */
public class A073114 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

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

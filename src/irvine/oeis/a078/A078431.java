package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A078431 Number of permutations p of 1,2,...,n such that both numerator and denominator of the continued fraction [p(1); p(2),...,p(n)] are primes.
 * @author Sean A. Irvine
 */
public class A078431 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Permutation perm = new Permutation(++mN);
    long cnt = 0;
    int[] p;
    while ((p = perm.next()) != null) {
      Z num = Z.valueOf(p[mN - 1] + 1); // +1 because our permutations are 0-based
      Z den = Z.ONE;
      for (int k = mN - 2; k >= 0; --k) {
        final Z t = num.multiply(p[k] + 1).add(den);
        den = num;
        num = t;
      }
      if (num.isProbablePrime() && den.isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}


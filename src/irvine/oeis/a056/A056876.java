package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A056876 Number of permutations (p_1, ..., p_n) of {1,...,n} that are "balanced" in the sense that the sum of k*p_k equals the sum of (n+1-k)*p_k; equivalently, the expected value of k*p_k is (expected value of k) times (expected value of p_k), assuming the uniform distribution.
 * @author Sean A. Irvine
 */
public class A056876 implements Sequence {

  // Too slow to be useful

  private int mN = 0;

  @Override
  public Z next() {
    if ((++mN & 3) == 2) {
      return Z.ZERO;
    }
    final Permutation perm = new Permutation(mN);
    long cnt = 0;
    int[] p;
    while ((p = perm.next()) != null) {
      long sum = 0;
      long j = mN - 1;
      for (int k = 0; k < p.length; ++k, j -= 2) {
        sum += j * p[k];
      }
      if (sum == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}


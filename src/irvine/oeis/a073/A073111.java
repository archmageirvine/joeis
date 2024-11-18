package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A073111 Number of permutations p of (1,2,3,...,n) such that 1^p(1)+2^p(2)+3^p(3)+...+n^p(n) is prime.
 * @author Sean A. Irvine
 */
public class A073111 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final int r = ++mN & 3;
    if (r == 0 || r == 3) {
      return Z.ZERO;
    }
    final Permutation perm = new Permutation(mN);
    int[] p;
    long cnt = 0;
    while ((p = perm.next()) != null) {
      Z s = Z.ZERO;
      for (int k = 0; k < p.length; ++k) {
        s = s.add(Z.valueOf(k + 1).pow(p[k] + 1));
      }
      if (s.isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

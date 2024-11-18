package irvine.oeis.a073;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A073090 Number of permutations p from (1,2,3,...,n) to (1,2,3...,n) such that 1/p(1)+2/p(2)+...+n/p(n) is an integer.
 * @author Sean A. Irvine
 */
public class A073090 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.ONE;
    }
    final Permutation perm = new Permutation(mN);
    int[] p;
    long cnt = 0;
    while ((p = perm.next()) != null) {
      Q s = Q.ZERO;
      for (int k = 0; k < p.length; ++k) {
        s = s.add(new Q(k + 1, p[k] + 1));
      }
      if (s.isInteger()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

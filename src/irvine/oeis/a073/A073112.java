package irvine.oeis.a073;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A073083.
 * @author Sean A. Irvine
 */
public class A073112 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Permutation perm = new Permutation(++mN);
    int[] p;
    long cnt = 0;
    while ((p = perm.next()) != null) {
      Q s = Q.ZERO;
      for (int k = 0; k < p.length; ++k) {
        s = s.add(new Q(1, p[k] + k + 2));
      }
      if (s.isInteger()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

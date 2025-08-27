package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A079804.
 * @author Sean A. Irvine
 */
public class A079806 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Permutation perm = Permutation.permuter(Z.valueOf(++mN));
    int[] p;
    long cnt = 0;
    while ((p = perm.next()) != null) {
      if ((p[p.length - 1] & 1) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}


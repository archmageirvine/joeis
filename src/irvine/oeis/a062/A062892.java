package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A062892 Number of squares that can be obtained by permuting the digits of n.
 * @author Sean A. Irvine
 */
public class A062892 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Permutation perm = Permutation.permuter(Z.valueOf(++mN));
    int[] p;
    long cnt = 0;
    while ((p = perm.next()) != null) {
      if (Permutation.permToZ(p).isSquare()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}


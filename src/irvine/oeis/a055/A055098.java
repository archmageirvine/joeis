package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A055098 Number of distinct anagrams of digits of n without leading zeros.
 * @author Sean A. Irvine
 */
public class A055098 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Permutation perm = Permutation.permuter(Z.valueOf(++mN));
    int[] p;
    long cnt = 0;
    while ((p = perm.next()) != null) {
      if (p[0] != 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

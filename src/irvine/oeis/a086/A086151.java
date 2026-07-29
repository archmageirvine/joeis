package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A086151 Number of permutations of decimal digits of 2^n which yield a prime.
 * @author Sean A. Irvine
 */
public class A086151 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    final Permutation perm = Permutation.permuter(Z.TWO.pow(++mN));
    int[] p;
    while ((p = perm.next()) != null) {
      if (Permutation.permToZ(p).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

package irvine.oeis.a046;

import irvine.math.LongUtils;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046144 Number of primitive roots modulo n.
 * @author Sean A. Irvine
 */
public class A046144 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z phi = Z.valueOf(LongUtils.phi(mN));
    final IntegersModMul rn = new IntegersModMul(mN);
    long cnt = 0;
    for (long q = 1; q <= mN; ++q) {
      if (LongUtils.gcd(q, mN) == 1 && rn.order(Z.valueOf(q)).equals(phi)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

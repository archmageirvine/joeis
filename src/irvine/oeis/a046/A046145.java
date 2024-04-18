package irvine.oeis.a046;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046145 Smallest primitive root modulo n, or 0 if no root exists.
 * @author Sean A. Irvine
 */
public class A046145 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ZERO;
    }
    final Z phi = Z.valueOf(Functions.PHI.l(mN));
    final IntegersModMul rn = new IntegersModMul(mN);
    for (long q = 1; q <= mN; ++q) {
      if (LongUtils.gcd(q, mN) == 1 && rn.order(Z.valueOf(q)).equals(phi)) {
        return Z.valueOf(q);
      }
    }
    return Z.ZERO;
  }
}

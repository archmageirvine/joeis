package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392364 a(n) is the least positive integer k such that tau(k)*tau(n)/(tau(k) + tau(n)) is an integer. If no such k exists a(n) = -1. tau(i) = A000005(i).
 * @author Sean A. Irvine
 */
public class A392364 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.NEG_ONE;
    }
    final Z sn = Functions.SIGMA0.z(mN);
    long k = 0;
    while (true) {
      final long sk = Functions.SIGMA0.l(++k);
      if (sn.multiply(sk).mod(sn.add(sk)).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}

package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060942 a(n) is the largest integer m such that m is divisible by every integer in the interval 1 &lt;= x &lt;= m^(1/n).
 * @author Sean A. Irvine
 */
public class A060942 extends Sequence1 {

  private long mN = 0;

  private boolean check(final Z n, final long k, final long t) {
    // By lcm construction we already know everything up to k divides n
    for (long j = k + 1; j <= t; ++j) {
      if (n.mod(j) != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final CR inv = CR.valueOf(++mN).inverse();
    Z lcm = Z.ONE;
    long k = 1;
    while (true) {
      final Z t = lcm;
      lcm = lcm.lcm(Z.valueOf(++k));
      if (!check(lcm, k, CR.valueOf(lcm).pow(inv).floor().longValueExact())) {
        return t;
      }
    }
  }
}

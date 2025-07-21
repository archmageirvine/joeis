package irvine.oeis.a385;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385731 Number of divisors d of n such that (-d) == (-d)^d == d^d (mod n).
 * @author Sean A. Irvine
 */
public class A385731 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final Z nsd = mN.subtract(d);
      if (d.modPow(d, mN).equals(nsd) && nsd.modPow(d, mN).equals(nsd)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

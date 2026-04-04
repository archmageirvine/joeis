package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A333024.
 * @author Sean A. Irvine
 */
public class A391684 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (Z.valueOf(mN / d.longValue()).square().subtract(1).mod(d).isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

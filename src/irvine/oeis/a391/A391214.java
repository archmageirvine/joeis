package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391214 Number of divisors d of n such that d^2 - 4 is relatively prime to n.
 * @author Sean A. Irvine
 */
public class A391214 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.square().subtract(4).gcd(mN).isOne()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

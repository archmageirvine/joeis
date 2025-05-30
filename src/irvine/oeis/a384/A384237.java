package irvine.oeis.a384;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077564.
 * @author Sean A. Irvine
 */
public class A384237 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    final Z n = Z.valueOf(++mN);
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (d.modPow(d, n).equals(d.mod(n))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

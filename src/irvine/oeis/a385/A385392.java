package irvine.oeis.a385;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385392 The number of divisors d of n such that -(d^d) == d (mod n).
 * @author Sean A. Irvine
 */
public class A385392 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    for (Z d : Jaguar.factor(mN).divisors()) {
      if (mN.subtract(d.modPow(d, mN)).mod(mN).equals(d.mod(mN))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}


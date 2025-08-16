package irvine.oeis.a386;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386930 Number of divisors d of n such that (-d)^d = -d^d (mod n).
 * @author Sean A. Irvine
 */
public class A386930 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    for (Z d : Jaguar.factor(mN).divisors()) {
      if (mN.subtract(d.modPow(d, mN)).mod(mN).equals(mN.subtract(d).modPow(d, mN))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}


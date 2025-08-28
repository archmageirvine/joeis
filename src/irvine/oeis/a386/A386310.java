package irvine.oeis.a386;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386310 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A386310 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    for (Z d : Jaguar.factor(mN).divisors()) {
      if (d.modPow(d, mN).modMultiply(Z.TWO, mN).isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}


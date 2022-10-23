package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049195 Numbers k such that the Euler totient function phi(k) is divisible by a square.
 * @author Sean A. Irvine
 */
public class A049195 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!Jaguar.factor(Euler.phi(mN)).isSquareFree()) {
        return mN;
      }
    }
  }
}


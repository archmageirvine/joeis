package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045795 Unitary-sigma sigma multiply perfect numbers: numbers k such that A061765(k) = m*k for some integer m.
 * @author Sean A. Irvine
 */
public class A045795 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(Functions.SIGMA1.z(mN)).unitarySigma().mod(mN).isZero()) {
        return mN;
      }
    }
  }
}


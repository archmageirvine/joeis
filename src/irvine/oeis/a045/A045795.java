package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045795 Unitary-sigma sigma multiply perfect numbers: numbers k such that A061765(k) = m*k for some integer m.
 * @author Sean A. Irvine
 */
public class A045795 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(Jaguar.factor(mN).sigma()).unitarySigma().mod(mN).isZero()) {
        return mN;
      }
    }
  }
}


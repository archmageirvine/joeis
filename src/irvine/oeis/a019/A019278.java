package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019278 Numbers j such that sigma(sigma(j)) = k*j for some k.
 * @author Sean A. Irvine
 */
public class A019278 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(Jaguar.factor(mN).sigma()).sigma().mod(mN).isZero()) {
        return mN;
      }
    }
  }
}


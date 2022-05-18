package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019278 Numbers n such that sigma(sigma(n)) = k*n for some k.
 * @author Sean A. Irvine
 */
public class A019278 implements Sequence {

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


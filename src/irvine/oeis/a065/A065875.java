package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065875 Usigma(Phi(n)) is a prime.
 * @author Sean A. Irvine
 */
public class A065875 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(Euler.phi(++mN)).unitarySigma().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}


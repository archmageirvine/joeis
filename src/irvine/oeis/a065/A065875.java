package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065875 Numbers k such that usigma(phi(k)) is a prime.
 * @author Sean A. Irvine
 */
public class A065875 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(Functions.PHI.z(++mN)).unitarySigma().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}


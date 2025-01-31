package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063836 Numbers k such that usigma(sigma(k)) is prime.
 * @author Sean A. Irvine
 */
public class A063836 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(Functions.SIGMA1.z(++mN)).unitarySigma().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

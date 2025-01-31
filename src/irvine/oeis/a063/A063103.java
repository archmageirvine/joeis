package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063103 Numbers k such that sigma(usigma(k)) is prime.
 * @author Sean A. Irvine
 */
public class A063103 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(Jaguar.factor(++mN).unitarySigma()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

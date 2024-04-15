package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063103 Numbers n such that sigma(usigma(n)) is prime.
 * @author Sean A. Irvine
 */
public class A063103 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(Jaguar.factor(++mN).unitarySigma()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

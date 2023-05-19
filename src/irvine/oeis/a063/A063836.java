package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063836 Numbers n such that usigma(sigma(n)) is prime.
 * @author Sean A. Irvine
 */
public class A063836 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(Jaguar.factor(++mN).sigma()).unitarySigma().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065872 Numbers k such that usigma(k) - 1 is a prime (cf. A034448).
 * @author Sean A. Irvine
 */
public class A065872 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).unitarySigma().subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}


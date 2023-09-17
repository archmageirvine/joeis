package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065871 Numbers k such that usigma(k) + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A065871 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).unitarySigma().add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}


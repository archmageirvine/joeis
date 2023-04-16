package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062969 d(n)-n-1 is prime.
 * @author Sean A. Irvine
 */
public class A062969 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma0().subtract(mN + 1).abs().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}


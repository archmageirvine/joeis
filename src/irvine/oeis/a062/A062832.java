package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062832 Numbers n such that n and n+2 have same number of divisors.
 * @author Sean A. Irvine
 */
public class A062832 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma0().equals(Jaguar.factor(mN + 2).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}

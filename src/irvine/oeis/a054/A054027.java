package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054027 Numbers that do not divide their sum of divisors.
 * @author Sean A. Irvine
 */
public class A054027 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).mod(mN) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}


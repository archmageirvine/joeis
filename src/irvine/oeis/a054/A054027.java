package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054027 Numbers that do not divide their sum of divisors.
 * @author Sean A. Irvine
 */
public class A054027 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).sigma().mod(mN) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}


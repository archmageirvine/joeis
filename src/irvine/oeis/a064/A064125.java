package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064125 Numbers k such that k and k+1 have the same sum of unitary divisors (A034448).
 * @author Sean A. Irvine
 */
public class A064125 extends Sequence1 {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).unitarySigma().equals(Jaguar.factor(mN + 1).unitarySigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}


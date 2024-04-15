package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019279 Superperfect numbers: numbers k such that sigma(sigma(k)) = 2*k where sigma is the sum-of-divisors function (A000203).
 * @author Sean A. Irvine
 */
public class A019279 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA.z(Jaguar.factor(mN).sigma()).equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}


package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019279 Superperfect numbers: numbers k such that sigma(sigma(k)) = 2*k where sigma is the sum-of-divisors function (A000203).
 * @author Sean A. Irvine
 */
public class A019279 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(Jaguar.factor(mN).sigma()).sigma().equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}


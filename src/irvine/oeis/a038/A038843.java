package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038843 Unitary superperfect numbers: numbers n such that usigma(usigma(n)) = 2*n, where usigma(n) is the sum of unitary divisors of n (A034448).
 * @author Sean A. Irvine
 */
public class A038843 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(Jaguar.factor(mN).unitarySigma()).unitarySigma().equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}

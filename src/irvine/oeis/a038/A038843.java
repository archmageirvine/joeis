package irvine.oeis.a038;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038843 Unitary superperfect numbers: numbers n such that usigma(usigma(n)) = 2*n, where usigma(n) is the sum of unitary divisors of n (A034448).
 * @author Sean A. Irvine
 */
public class A038843 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(Cheetah.factor(mN).unitarySigma()).unitarySigma().equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}

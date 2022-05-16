package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045795 Unitary-sigma sigma multiply perfect numbers n such that usigma(sigma(n)) = m*n for some integer m, where if sigma(n) = product p(i)^r(i) then usigma(sigma(n)) = product (p(i)^r(i)+1).
 * @author Sean A. Irvine
 */
public class A045795 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(Jaguar.factor(mN).sigma()).unitarySigma().mod(mN).isZero()) {
        return mN;
      }
    }
  }
}


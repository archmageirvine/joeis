package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033857 Numbers n such that j(n)*phi(n)=usigma(n), where j(n) = A033831, usigma(n) = sum of unitary divisors of n (A034448).
 * @author Sean A. Irvine
 */
public class A033857 extends A033831 {

  @Override
  public Z next() {
    while (true) {
      final Z j = super.next();
      if (j.multiply(mFactorSequence.phi()).equals(mFactorSequence.unitarySigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}

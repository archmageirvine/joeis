package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033857 Numbers n such that <code>j(n)*phi(n)=usigma(n)</code>, where <code>j(n) = A033831, usigma(n) =</code> sum of unitary divisors of <code>n (A034448)</code>.
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

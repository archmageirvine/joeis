package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a034.A034448;

/**
 * A055033 usigma(usigma(n)), where usigma(n) is the sum of unitary divisors of n (A034448).
 * @author Sean A. Irvine
 */
public class A055033 extends A034448 {

  @Override
  public Z next() {
    return Cheetah.factor(super.next()).unitarySigma();
  }
}

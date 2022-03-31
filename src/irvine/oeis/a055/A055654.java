package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055654 Difference between n and the result of "Phi-summation" over unitary divisors of n.
 * @author Sean A. Irvine
 */
public class A055654 extends A055653 {

  @Override
  public Z next() {
    final Z t = super.next();
    return Z.valueOf(mN).subtract(t);
  }
}

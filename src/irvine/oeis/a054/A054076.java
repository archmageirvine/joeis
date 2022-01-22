package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A054076 Permutation of N: a(n)+C(k,2), where a=A054073 and k=Floor((1+sqrt(8n-3))/2).
 * @author Sean A. Irvine
 */
public class A054076 extends A054073 {

  @Override
  public Z next() {
    return super.next().add(Binomial.binomial(mP.length, 2));
  }
}

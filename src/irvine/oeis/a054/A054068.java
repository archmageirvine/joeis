package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A054068 Permutation of N = set of natural numbers: a(n)+C(k,2), where a=A054065 and k=Floor((1+sqrt(8n-3))/2).
 * @author Sean A. Irvine
 */
public class A054068 extends A054065 {

  @Override
  public Z next() {
    return super.next().add(Binomial.binomial(mP.length, 2));
  }
}

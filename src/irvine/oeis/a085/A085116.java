package irvine.oeis.a085;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A085116 Denominator of G(n) = Sum_{k=1..n} (1/(2*2^k)) * Sum_{j=0..k-1} 1/binomial(2^(k-j)+j,j).
 * @author Sean A. Irvine
 */
public class A085116 extends A085115 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}


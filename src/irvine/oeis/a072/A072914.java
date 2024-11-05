package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A072914 Denominators of 1/4!*(H(n,1)^4+6*H(n,1)^2*H(n,2)+8*H(n,1)*H(n,3)+3*H(n,2)^2+6*H(n,4)), where H(n,m) = Sum_{i=1..n} 1/i^m are generalized harmonic numbers.
 * @author Sean A. Irvine
 */
public class A072914 extends A072913 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}


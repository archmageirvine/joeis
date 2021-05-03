package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A046879 Denominator of (1/n)*Sum_{k=0..n-1} 1/binomial(n-1,k) for n&gt;0 else 1.
 * @author Sean A. Irvine
 */
public class A046879 extends A046878 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A046826 Denominator of Sum_{k=0..n} 1/binomial(n,k).
 * @author Sean A. Irvine
 */
public class A046826 extends A046825 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

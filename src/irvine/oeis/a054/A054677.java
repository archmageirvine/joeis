package irvine.oeis.a054;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A054677 Denominator of expected length of longest increasing subsequence of a permutation of length n.
 * @author Sean A. Irvine
 */
public class A054677 extends A054676 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

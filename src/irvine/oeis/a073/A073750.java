package irvine.oeis.a073;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A073750 Factors of 2 in the denominators of the fractional coefficients of the square-root of the prime power series: sum_{n=0..inf} p_n x^n, where p_n is the n-th prime and p_0 is defined to be 1.
 * @author Sean A. Irvine
 */
public class A073750 extends A073749 {

  @Override
  protected Z select(final Q n) {
    // Uncomment the following to verify the assertion in A073750 that D_n=1
//    if (n.den().bitCount() > 1) {
//      throw new UnsupportedOperationException("Non-unit term: " + n);
//    }
    return Z.valueOf(n.den().makeOdd().auxiliary());
  }
}

package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A028234 If n = p_1^e_1 * ... * p_k^e_k, p_1 &lt; ... &lt; p_k primes, then a(n) = n/p_1^e_1, with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A028234 extends Sequence1 implements DirectSequence {

  private int mN = 0;
  private static final DirectSequence A028233 = new A028233();

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return n.divide(A028233.a(n));
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).divide(A028233.a(n));
  }

}

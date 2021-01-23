package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028234 If n = p_1^e_1 * ... * p_k^e_k, p_1 &lt; ... &lt; p_k primes, then a(n) = n/p_1^e_1, with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A028234 extends A028233 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).divide(super.next());
  }
}

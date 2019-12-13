package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028234 If <code>n = p_1^e_1 * ... * p_k^e_k, p_1 &lt; ... &lt; p_k</code> primes, then <code>a(n) = n/p_1^e_1</code>, with <code>a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A028234 extends A028233 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).divide(super.next());
  }
}

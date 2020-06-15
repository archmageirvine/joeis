package irvine.oeis.a063;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063482 <code>p(n) *</code> last digit of <code>p(n)</code> where <code>p(n)</code> is n-th prime.
 * @author Georg Fischer
 */
public class A063482 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return nextPrime.multiply(nextPrime.mod(Z.TEN));
  }
}

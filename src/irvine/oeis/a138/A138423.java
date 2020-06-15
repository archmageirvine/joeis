package irvine.oeis.a138;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A138423 <code>a(n) = (prime(n)^4 - prime(n)^3)/2</code>.
 * @author Georg Fischer
 */
public class A138423 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return nextPrime.pow(4).subtract(nextPrime.pow(3)).divide(Z.TWO);
  }
}

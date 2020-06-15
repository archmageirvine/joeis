package irvine.oeis.a138;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A138458 <code>a(n) = ((n-th prime)^6-(n-th prime)^4))/24</code>.
 * @author Georg Fischer
 */
public class A138458 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return nextPrime.pow(6).subtract(nextPrime.pow(4)).divide(Z.valueOf(24));
  }
}

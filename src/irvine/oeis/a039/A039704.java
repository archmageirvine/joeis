package irvine.oeis.a039;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A039704 a(n) = n-th prime modulo 6.
 * @author Georg Fischer
 */
public class A039704 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return nextPrime.mod(Z.SIX);
  }
}

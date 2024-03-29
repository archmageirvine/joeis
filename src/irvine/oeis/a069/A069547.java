package irvine.oeis.a069;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A069547 a(n) = n^2 mod n-th prime.
 * @author Georg Fischer
 */
public class A069547 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return Z.valueOf(mN).square().mod(nextPrime);
  }
}

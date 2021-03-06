package irvine.oeis.a038;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038194 Iterated sum-of-digits of n-th prime; or digital root of n-th prime; or n-th prime modulo 9.
 * @author Georg Fischer
 */
public class A038194 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return nextPrime.mod(Z.NINE);
  }
}

package irvine.oeis.a051;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051156 <code>a(n) = (2^p^2 - 1)/(2^p - 1)</code> where p is the n-th prime.
 * @author Georg Fischer
 */
public class A051156 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return Z.TWO.pow(nextPrime.pow(2)).subtract(Z.ONE).divide(Z.TWO.pow(nextPrime).subtract(Z.ONE));
  }
}

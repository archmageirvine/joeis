package irvine.oeis.a060;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060019 <code>a(n) = floor(2*sqrt(prime(n)-2))</code> where <code>prime(n) = n-th</code> prime.
 * @author Georg Fischer
 */
public class A060019 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return CR.TWO.multiply(CR.valueOf(nextPrime.subtract(Z.TWO)).sqrt()).floor();
  }
}

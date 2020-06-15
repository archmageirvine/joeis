package irvine.oeis.a034;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A034785 <code>a(n) = 2^(n-th</code> prime).
 * @author Georg Fischer
 */
public class A034785 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return Z.TWO.pow(nextPrime);
  }
}

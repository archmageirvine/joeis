package irvine.oeis.a091;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A091931 Change the first bit to 0 in binary notation for the n-th prime.
 * @author Georg Fischer
 */
public class A091931 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return new Z(nextPrime.toString(2).substring(1), 2);
  }
}

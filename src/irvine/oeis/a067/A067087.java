package irvine.oeis.a067;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067087 Concatenation of n-th prime and its reverse.
 * @author Georg Fischer
 */
public class A067087 extends A000040 {
  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return new Z(nextPrime.toString() + Functions.REVERSE.z(nextPrime));
  }
}

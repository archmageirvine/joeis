package irvine.oeis.a089;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A089620 a(n) = n^3 + prime(n).
 * @author Georg Fischer
 */
public class A089620 extends A000040 {
  protected long mN = 0;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return Z.valueOf(mN).pow(3).add(nextPrime);
  }
}

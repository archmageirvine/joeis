package irvine.oeis.a173;

import irvine.math.z.Z;
import irvine.oeis.a134.A134323;

/**
 * A173950 a(n) = 1 if 6 divides (prime(n) + 1), a(n) = -1 if 6 divides (prime(n) - 1), a(n) = 0 otherwise.
 * @author Georg Fischer
 */
public class A173950 extends A134323 {

  private int mN = 0;

  @Override
  public Z next() {
    return (++mN == 1) ? super.next().negate().add(-1) : super.next().negate();
  }
}

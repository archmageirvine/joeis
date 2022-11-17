package irvine.oeis.a319;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A319998 a(n) = Sum_{d|n, d is even} mu(n/d)*d, where mu(n) is Moebius function A008683.
 * @author Georg Fischer
 */
public class A319998 extends A000010 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 1) ? Z.ZERO : super.next().multiply2();
  }
}

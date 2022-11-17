package irvine.oeis.a195;

import irvine.math.z.Z;
import irvine.oeis.a007.A007862;

/**
 * A195155 Number of divisors d of n such that d-1 also divides n or d-1 = 0.
 * @author Georg Fischer
 */
public class A195155 extends A007862 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 1) ? Z.ONE : super.next().add(1);
  }
}

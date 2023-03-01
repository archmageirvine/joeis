package irvine.oeis.a344;
// manually sigman0/sigma0s at 2023-02-28 16:08

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000533;

/**
 * A344897 a(n) is the number of divisors of 10^n + 1.
 * @author Georg Fischer
 */
public class A344897 extends A000533 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z result = Jaguar.factor(super.next()).sigma0();
    return (mN == 1) ? Z.TWO : result;
  }
}

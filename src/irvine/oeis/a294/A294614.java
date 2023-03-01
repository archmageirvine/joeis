package irvine.oeis.a294;
// manually sigman1/sigma1 at 2023-02-28 22:58

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a017.A017653;

/**
 * A294614 Sum of the divisors of 12*n - 1, divided by 12, minus n.
 * @author Georg Fischer
 */
public class A294614 extends A017653 {

  private int mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma().divide(12).subtract(++mN);
  }
}

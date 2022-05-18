package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A055928 Sum of square divisors of n! = sum of squares of divisors of the square root of largest square dividing n!.
 * @author Sean A. Irvine
 */
public class A055928 extends A055772 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma(2);
  }
}

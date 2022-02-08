package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a032.A032742;

/**
 * A054576 Largest proper factor of the largest proper factor of n.
 * @author Sean A. Irvine
 */
public class A054576 extends A032742 {

  @Override
  public Z next() {
    final Z n = super.next();
    if (Z.ONE.equals(n)) {
      return Z.ONE;
    }
    final Z[] divisors = Cheetah.factor(n).divisorsSorted();
    return divisors[divisors.length - 2];
  }
}

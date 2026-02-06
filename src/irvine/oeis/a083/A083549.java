package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083549 Quotient if least common multiple (lcm) of cototient values of consecutive integers is divided by the greatest common divisor (gcd) of the same pair of consecutive numbers.
 * @author Sean A. Irvine
 */
public class A083549 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z c1 = Functions.COTOTIENT.z(++mN);
    final Z c2 = Functions.COTOTIENT.z(mN + 1);
    return Functions.LCM.z(c1, c2).divide(Functions.GCD.z(c1, c2));
  }
}

package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A383615 Length of the long leg of the unique primitive Pythagorean triple (x,y,z) such that (x-y+z)/2 = A000108(n) and its long leg and hypotenuse are consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A383615 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z c = Functions.CATALAN.z(++mN);
    return c.multiply(c.subtract(1)).multiply2();
  }
}

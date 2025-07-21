package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A078800.
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

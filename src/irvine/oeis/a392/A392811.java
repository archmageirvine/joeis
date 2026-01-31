package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392811 allocated for Ben Spitz.
 * @author Sean A. Irvine
 */
public class A392811 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z c = Functions.CATALAN.z(mN);
    return c.square().add(Functions.CATALAN.z(mN - 1).multiply(Functions.CATALAN.z(mN + 1).subtract(c.multiply2()))).multiply2();
  }
}

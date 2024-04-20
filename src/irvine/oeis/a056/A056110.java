package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A056110 Highest proper factor of n!-1, or a(n)=1 if n!-1 is not composite.
 * @author Sean A. Irvine
 */
public class A056110 extends Sequence2 {

  private int mN = 1;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    final Z t = mF.subtract(1);
    return t.divide(Functions.LPF.z(t));
  }
}

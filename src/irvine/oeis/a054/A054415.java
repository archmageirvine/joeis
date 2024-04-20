package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A054415 Smallest prime factor of n!-1 (for n&gt;2), a(2)=1.
 * @author Sean A. Irvine
 */
public class A054415 extends Sequence2 {

  private int mN = 1;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return Functions.LPF.z(mF.subtract(1));
  }
}

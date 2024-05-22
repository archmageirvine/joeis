package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038048 a(n) = (n-1)! * sigma(n).
 * @author Sean A. Irvine
 */
public class A038048 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    final Z res = Functions.SIGMA1.z(++mN).multiply(mF);
    mF = mF.multiply(mN);
    return res;
  }
}

package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A005462 Number of simplices in barycentric subdivision of n-simplex.
 * @author Sean A. Irvine
 */
public class A005462 extends Sequence3 {

  private long mN = 4;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN > 6) {
      mF = mF.multiply(mN - 5);
    }
    return Functions.STIRLING2.z(mN, mN - 4).multiply(mF);
  }
}

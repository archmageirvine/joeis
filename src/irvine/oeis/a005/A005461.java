package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005461 Number of simplices in barycentric subdivision of n-simplex.
 * @author Sean A. Irvine
 */
public class A005461 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.SIX;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN + 3);
    return mF.multiply(mN).multiply(mN + 1).divide(48);
  }
}

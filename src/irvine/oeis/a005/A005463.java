package irvine.oeis.a005;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005463 Number of simplices in barycentric subdivision of <code>n-simplex</code>.
 * @author Sean A. Irvine
 */
public class A005463 implements Sequence {

  private long mN = 5;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN > 7) {
      mF = mF.multiply(mN - 6);
    }
    return Stirling.secondKind(mN, mN - 5).multiply(mF);
  }
}

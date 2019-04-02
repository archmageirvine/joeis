package irvine.oeis.a005;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005464 Number of simplices in barycentric subdivision of n-simplex.
 * @author Sean A. Irvine
 */
public class A005464 implements Sequence {

  private long mN = 6;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN > 8) {
      mF = mF.multiply(mN - 7);
    }
    return Stirling.secondKind(mN, mN - 6).multiply(mF);
  }
}

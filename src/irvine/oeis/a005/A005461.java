package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005461 Number of simplices in barycentric subdivision of <code>n-simplex</code>.
 * @author Sean A. Irvine
 */
public class A005461 implements Sequence {

  private long mN = 0;
  private Z mF = Z.SIX;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN + 3);
    return mF.multiply(mN).multiply(mN + 1).divide(48);
  }
}

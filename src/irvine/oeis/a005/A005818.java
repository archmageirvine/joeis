package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005818 Numbers n that are primitive solutions to n^2 = a^2 + b^2 + c^2 (a,b,c &gt; 0).
 * @author Sean A. Irvine
 */
public class A005818 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    if (Z.FIVE.equals(mN)) {
      mN = mN.add(2);
    }
    return mN;
  }
}

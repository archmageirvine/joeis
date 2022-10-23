package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022776 Place where n-th 1 occurs in A023115.
 * @author Sean A. Irvine
 */
public class A022776 extends Sequence1 {

  private long mN = -1;
  private Z mSum = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mSum = mSum.add(CR.valueOf(mN).divide(CR.SQRT2).ceil());
    }
    return mSum;
  }
}

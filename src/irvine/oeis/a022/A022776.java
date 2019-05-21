package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022776 Place where <code>n-th 1</code> occurs in <code>A023115</code>.
 * @author Sean A. Irvine
 */
public class A022776 implements Sequence {

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

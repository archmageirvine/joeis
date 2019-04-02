package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A014311 Numbers with exactly 3 ones in binary expansion.
 * @author Sean A. Irvine
 */
public class A014311 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.SEVEN : ZUtils.swizzle(mN);
    return mN;
  }
}


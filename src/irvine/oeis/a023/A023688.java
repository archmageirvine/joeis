package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A023688 Numbers with exactly 6 ones in binary expansion.
 * @author Sean A. Irvine
 */
public class A023688 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(63) : ZUtils.swizzle(mN);
    return mN;
  }
}


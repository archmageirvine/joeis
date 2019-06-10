package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023690 Numbers with exactly 8 ones in binary expansion.
 * @author Sean A. Irvine
 */
public class A023690 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(255) : ZUtils.swizzle(mN);
    return mN;
  }
}


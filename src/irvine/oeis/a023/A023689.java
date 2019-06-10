package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023689 Numbers with exactly 7 ones in binary expansion.
 * @author Sean A. Irvine
 */
public class A023689 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(127) : ZUtils.swizzle(mN);
    return mN;
  }
}


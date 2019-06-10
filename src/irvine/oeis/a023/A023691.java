package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023691 Numbers with exactly 9 ones in binary expansion.
 * @author Sean A. Irvine
 */
public class A023691 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(511) : ZUtils.swizzle(mN);
    return mN;
  }
}


package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A014313 Numbers with exactly 5 ones in binary expansion.
 * @author Sean A. Irvine
 */
public class A014313 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(31) : ZUtils.swizzle(mN);
    return mN;
  }
}


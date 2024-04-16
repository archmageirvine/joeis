package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023689 Numbers with exactly 7 ones in binary expansion.
 * @author Sean A. Irvine
 */
public class A023689 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(127) : Functions.SWIZZLE.z(mN);
    return mN;
  }
}


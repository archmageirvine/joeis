package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023690 Numbers with exactly 8 ones in binary expansion.
 * @author Sean A. Irvine
 */
public class A023690 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(255) : Functions.SWIZZLE.z(mN);
    return mN;
  }
}


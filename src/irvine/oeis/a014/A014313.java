package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014313 Numbers with exactly 5 ones in binary expansion.
 * @author Sean A. Irvine
 */
public class A014313 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(31) : Functions.SWIZZLE.z(mN);
    return mN;
  }
}


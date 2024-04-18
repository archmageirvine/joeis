package irvine.oeis.a064;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064368 Number of 2 X 2 symmetric singular matrices with entries from {0,...,n}.
 * @author Sean A. Irvine
 */
public class A064368 extends Sequence0 {

  private int mN = -1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 0) {
      mSum = mSum.add(Integers.SINGLETON.sumdiv(mN, d -> LongUtils.isSquare(d) ? Functions.PHI.z(LongUtils.sqrt(d)) : Z.ZERO).multiply2());
    }
    return mSum.add(mN + 1);
  }
}


package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394792 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A394792 extends Sequence1 {

  private long mN = 0;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (Functions.SIGMA0.l(Functions.MAKE_ODD.l(++mN)) == 3) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}

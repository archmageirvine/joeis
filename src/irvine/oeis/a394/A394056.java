package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A305213.
 * @author Sean A. Irvine
 */
public class A394056 extends Sequence1 {

  private long mN = 0;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (Functions.SIGMA0.z(++mN).equals(Z.FOUR)) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}

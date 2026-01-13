package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392243 allocated for Dwight Boddorf.
 * @author Sean A. Irvine
 */
public class A392243 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(Z.NEG_ONE.pow(Functions.CEIL_SQRT.l(++mN)).multiply(mN));
    return mSum;
  }
}

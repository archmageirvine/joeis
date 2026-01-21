package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083379 a(n) = the number of squares with at most n digits and first digit 1.
 * @author Sean A. Irvine
 */
public class A083379 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z t = Z.TEN.pow(mN);
    mSum = mSum.add(t.multiply2().sqrt().subtract(Functions.CEIL_SQRT.z(t)).add(1));
    return mSum;
  }
}

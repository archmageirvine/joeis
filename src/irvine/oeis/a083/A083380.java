package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083380 a(n) is the number of cubes with at most n digits and first digit 1.
 * @author Sean A. Irvine
 */
public class A083380 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z t = Z.TEN.pow(mN);
    mSum = mSum.add(t.multiply2().root(3).subtract(Functions.CEIL_CBRT.z(t)).add(1));
    return mSum;
  }
}

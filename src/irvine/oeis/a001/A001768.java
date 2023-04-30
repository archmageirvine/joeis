package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001768 Sorting numbers: number of comparisons for merge insertion sort of n elements.
 * @author Sean A. Irvine
 */
public class A001768 extends Sequence1 {

  private static final CR THREE_QUARTERS = CR.THREE.divide(CR.FOUR);
  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final CR ntq = CR.valueOf(mN).multiply(THREE_QUARTERS);
    final Z v = ntq.log().divide(CR.LOG2).ceil();
    mSum = mSum.add(v);
    return mSum;
  }
}

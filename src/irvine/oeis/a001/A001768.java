package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.cr.CR;
import irvine.oeis.Sequence;

/**
 * A001768 Sorting numbers: number of comparisons for merge insertion sort of n elements.
 * @author Sean A. Irvine
 */
public class A001768 implements Sequence {

  private static final CR THREE_QUARTERS = CR.THREE.divide(CR.FOUR);
  private static final CR LOG2 = CR.TWO.log();
  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final CR ntq = CR.valueOf(mN).multiply(THREE_QUARTERS);
    final Z v = ntq.log().divide(LOG2).ceil();
    mSum = mSum.add(v);
    return mSum;
  }
}

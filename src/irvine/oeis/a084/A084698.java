package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084698 Beginning with 1 the smallest multiple of n such that the n-th partial sum is a square.
 * @author Sean A. Irvine
 */
public class A084698 extends Sequence1 {

  private Z mSum = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mSum;
      do {
        mSum = mSum.add(mN);
      } while (!Predicates.SQUARE.is(mSum));
      return mSum.subtract(t);
    }
    return mSum;
  }
}

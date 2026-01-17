package irvine.oeis.a388;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A388659 Numbers k for which there exists m such that the sum from 1 to m and the sum from m + 1 to k are both perfect squares.
 * @author Sean A. Irvine
 */
public class A388659 extends Sequence1 {

  private final DynamicLongArray mSquareSums = new DynamicLongArray();
  private long mTotal = 0;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mTotal += ++mN;
      for (int k = 0; k < mSquareSums.length(); ++k) {
        if (Predicates.SQUARE.is(mTotal - mSquareSums.get(k))) {
          return Z.valueOf(mN);
        }
      }
      if (Predicates.SQUARE.is(mTotal)) {
        mSquareSums.set(mSquareSums.length(), mTotal);
      }
    }
  }
}


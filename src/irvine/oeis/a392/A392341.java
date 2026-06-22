package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392341 allocated for Shahin Saadati.
 * @author Sean A. Irvine
 */
public class A392341 extends Sequence1 {

  private long mCount = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long y = 1; y < mN; ++y) {
      if (Predicates.SQUARE.is(Functions.GCD.l(y, mN))) {
        ++mCount;
      }
    }
    return Z.valueOf(mCount);
  }
}

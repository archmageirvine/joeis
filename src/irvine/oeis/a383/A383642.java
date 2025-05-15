package irvine.oeis.a383;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383642 allocated for Huaineng He.
 * @author Sean A. Irvine
 */
public class A383642 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long k = 1; k <= mN / 2; ++k) {
        if (Predicates.CUBE.is(k * (mN - k))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}


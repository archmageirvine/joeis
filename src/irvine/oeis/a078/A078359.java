package irvine.oeis.a078;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078359 Number of ways to write n as sum of a positive square and a positive cube.
 * @author Sean A. Irvine
 */
public class A078359 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long b;
    for (long k = 1; (b = mN - k * k * k) > 0; ++k) {
      if (Predicates.SQUARE.is(b)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}


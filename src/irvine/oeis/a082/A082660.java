package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082660 Number of ways n can be expressed as the sum of a square and a triangular number.
 * @author Sean A. Irvine
 */
public class A082660 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long s;
    for (long k = 1; (s = mN - Functions.TRIANGULAR.l(k)) >= 0; ++k) {
      if (Predicates.SQUARE.is(s)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

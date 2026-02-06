package irvine.oeis.a391;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391527 a(n) is the number of quadratic polynomials with coefficients in {-n, ..., n}, positive leading coefficient, and having two rational roots.
 * @author Sean A. Irvine
 */
public class A391527 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long i = 1; i <= mN; ++i) {
      for (long j = -mN; j <= mN; ++j) {
        for (long k = -mN; k <= mN; ++k) {
          if (Predicates.SQUARE.is(j * j - 4 * i * k)) {
            ++count;
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}

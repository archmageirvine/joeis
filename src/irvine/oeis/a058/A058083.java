package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A058083 a(1) = 1; a(n+1) = sum of terms in continued fraction for sum of continued fractions, [a(n); a(n-1), a(n-2),...,a(1)] and [0; a(n), a(n-1), a(n-2),...,a(1)].
 * @author Sean A. Irvine
 */
public class A058083 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Q a = new Q(get(0));
    for (int k = 1; k < n; ++k) {
      a = a.reciprocal().add(get(k));
    }
    return A058027.continuedFractionSum(a.add(a.reciprocal()));
  }
}

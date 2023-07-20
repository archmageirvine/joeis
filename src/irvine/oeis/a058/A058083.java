package irvine.oeis.a058;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A058083 a(1) = 1; a(n+1) = sum of terms in continued fraction for sum of continued fractions, [a(n); a(n-1), a(n-2),...,a(1)] and [0; a(n), a(n-1), a(n-2),...,a(1)].
 * @author Sean A. Irvine
 */
public class A058083 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Q a = new Q(a(0));
    for (int k = 1; k < n; ++k) {
      a = a.reciprocal().add(a(k));
    }
    return ContinuedFractionUtils.continuedFractionSum(a.add(a.reciprocal()));
  }
}

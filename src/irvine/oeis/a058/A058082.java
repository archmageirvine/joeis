package irvine.oeis.a058;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A058082 a(1) = 1; a(n+1) = sum of terms in continued fraction for the sum of the continued fractions, [a(1); a(2), a(3), ..., a(n)] and [0; a(1), a(2), a(3), ..., a(n)].
 * @author Sean A. Irvine
 */
public class A058082 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Q b = new Q(a(n - 1));
    for (int k = 1; k < n; ++k) {
      b = b.reciprocal().add(a(n - k - 1));
    }
    return ContinuedFractionUtils.continuedFractionSum(b.add(b.reciprocal()));
  }
}

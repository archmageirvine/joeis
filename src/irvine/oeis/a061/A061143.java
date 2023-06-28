package irvine.oeis.a061;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A061143 a(1) = 1; a(n) = sum of terms in the continued fraction for the square of the continued fraction [a(1); a(2), a(3), a(4),..., a(n-1)].
 * @author Sean A. Irvine
 */
public class A061143 extends MemorySequence {

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.ONE;
    }
    Q d = new Q(a(n - 1));
    for (int k = n - 2; k >= 0; --k) {
      d = d.reciprocal().add(a(k));
    }
    d = d.square();
    return ContinuedFractionUtils.continuedFractionSum(d);
  }
}

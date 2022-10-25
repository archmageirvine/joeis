package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a001.A001006;

/**
 * A045994 a(0)=1, a(n) = M(n) + Sum_{k=1..n-1} M(k)*a(n-k-1), where M(n) are the Motzkin numbers (A001006).
 * @author Sean A. Irvine
 */
public class A045994 extends MemorySequence {

  private final MemorySequence mMotzkin = MemorySequence.cachedSequence(new A001006());

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = mMotzkin.a(n);
    for (int k = 1; k < n; ++k) {
      sum = sum.add(mMotzkin.a(k).multiply(a(n - k - 1)));
    }
    return sum;
  }
}

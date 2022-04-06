package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A055873 a(0) = 1; a(n) = sum_{k=1 to d(n)} [a(n-k)] where d(n) is number of positive divisors of n.
 * @author Sean A. Irvine
 */
public class A055873 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(1, Cheetah.factor(n).sigma0().intValueExact(), k -> get(n - k));
  }
}

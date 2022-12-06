package irvine.oeis.a060;

import irvine.math.z.BellNumbers;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A060639 Number of pairs of partitions of [n] whose join is the partition {{1,2,...,n}}.
 * @author Sean A. Irvine
 */
public class A060639 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    final Z s = Integers.SINGLETON.sum(1, n - 1, k -> Binomial.binomial(n, k).multiply(BellNumbers.bell(n - k).square().multiply(k).multiply(a(k))));
    return BellNumbers.bell(n).square().subtract(s.divide(n));
  }
}


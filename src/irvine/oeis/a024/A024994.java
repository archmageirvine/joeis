package irvine.oeis.a024;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000009;

/**
 * A024994 Number of periodic partitions of n: each part occurs more than once and the same number of times.
 * @author Sean A. Irvine
 */
public class A024994 implements Sequence {

  private final MemorySequence mPartitions = MemorySequence.cachedSequence(new A000009());
  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      if (d != mN) {
        sum = sum.add(mPartitions.a(d));
      }
    }
    return sum;
  }
}

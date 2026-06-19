package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085436 Number of partitions of n without rotational symmetry (or 1-fold symmetry).
 * @author Sean A. Irvine
 */
public class A085436 extends Sequence1 {

  private int mN = 0;

  private boolean hasSymmetry(final int[] p, final long d) {
    int k = 0;
    while (k < p.length) {
      final int v = p[k];
      int len = 1;
      while (++k < p.length && p[k] == v) {
        ++len;
      }
      if ((long) v * len % d != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Z[] divisors = fs.divisorsSorted();

    // fixp[n]: counts of partitions having at least d-fold symmetry,
    // indexed by divisors in increasing order.
    final long[] fixp = new long[divisors.length];
    final IntegerPartition ip = new IntegerPartition(mN);
    int[] p;
    while ((p = ip.next()) != null) {
      for (int k = 0; k < divisors.length; ++k) {
        if (hasSymmetry(p, divisors[k].longValue())) {
          ++fixp[k];
        }
      }
    }

    // Mobius inversion.
    // exact[k] = partitions with exactly divisors[k]-fold symmetry.
    final Z[] exact = new Z[divisors.length];
    for (int k = 0; k < divisors.length; ++k) {
      Z s = Z.ZERO;
      final long d = divisors[k].longValue();
      for (int j = k; j < divisors.length; ++j) {
        final long e = divisors[j].longValue();
        if (e % d == 0) {
          s = s.add(fixp[j] * Functions.MOBIUS.i(e / d));
        }
      }
      exact[k] = s;
    }

    // divisor 1 is first in the sorted divisor list.
    return exact[0];
  }
}

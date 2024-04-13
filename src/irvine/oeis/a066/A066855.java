package irvine.oeis.a066;

import irvine.math.partition.FixedLengthPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001055;
import irvine.oeis.memory.MemorySequence;
import irvine.util.Permutation;

/**
 * A066855 Triangle T(n,k) of numbers of representations of n as a sum of k products of positive integers, k=1..n. 1 is not allowed as a factor, unless it is the only factor.Representations which differ only in the order of terms or factors are considered equivalent.
 * @author Sean A. Irvine
 */
public class A066855 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A001055());
  private int mN = 0;
  private int mM = 0;

  private boolean is(final int[] p, final int n) {
    int sum = 0;
    for (int k = 0; k < p.length; ++k) {
      sum += (k + 1) * p[k];
    }
    return sum == n;
  }

  private Z t(final int n, final int k) {
    Z sum = Z.ZERO;
    final FixedLengthPartition part = new FixedLengthPartition(k, n, 0);
    int[] p;
    while ((p = part.next()) != null) {
      final Permutation perm = new Permutation(p);
      int[] q;
      while ((q = perm.next()) != null) {
        if (is(q, n)) {
          Z prod = Z.ONE;
          for (int j = 0; j < q.length; ++j) {
            prod = prod.multiply(Binomial.binomial(q[j] + mA.a(j).intValueExact() - 1, q[j]));
          }
          sum = sum.add(prod);
        }
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}

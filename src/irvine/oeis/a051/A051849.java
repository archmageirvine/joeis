package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A051849 Table in which n-th row gives all compositions of n interpreted as digits in base n+1.
 * @author Sean A. Irvine
 */
public class A051849 extends Sequence1 {

  protected int mN = 0;
  private final TreeSet<Z> mA = new TreeSet<>();

  private void compositions(final TreeSet<Z> res, final int n) {
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      final Permutation perm = new Permutation(p);
      int[] pi;
      while ((pi = perm.next()) != null) {
        Z r = Z.ZERO;
        for (final int v : pi) {
          r = r.multiply(mN + 1).add(v);
        }
        res.add(r);
      }
    }
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      compositions(mA, ++mN);
    }
    return mA.pollFirst();
  }
}


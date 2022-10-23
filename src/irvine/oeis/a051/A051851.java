package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051851 Table in which n-th row gives all partitions of n interpreted in base n+1. (A subset of A051849 with each term having a non-descending digit-sequence in base n+1).
 * @author Sean A. Irvine
 */
public class A051851 extends Sequence1 {

  protected int mN = 0;
  private final TreeSet<Z> mA = new TreeSet<>();

  private void partitions(final TreeSet<Z> res, final int n) {
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      Z r = Z.ZERO;
      for (int k = p.length - 1; k >= 0; --k) {
        r = r.multiply(mN + 1).add(p[k]);
      }
      res.add(r);
    }
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      partitions(mA, ++mN);
    }
    return mA.pollFirst();
  }
}


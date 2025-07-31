package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079129 Number of degree-n permutations with pairwise coprime cycle lengths.
 * @author Sean A. Irvine
 */
public class A079129 extends Sequence0 {

  private int mN = -1;

  private boolean isPairwaiseCoprime(final int[] p) {
    for (int k = 1; k < p.length; ++k) {
      for (int j = 0; j < k; ++j) {
        if (Functions.GCD.i(p[k], p[j]) != 1) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    Z sum = Z.ZERO;
    int[] p;
    while ((p = part.next()) != null) {
      if (isPairwaiseCoprime(p)) {
        sum = sum.add(IntegerPartition.permCount(p));
      }
    }
    return sum;
  }
}


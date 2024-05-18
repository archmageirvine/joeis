package irvine.oeis.a069;

import irvine.math.partition.FixedLengthPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069713 As a square array T(n,k) by antidiagonals, number of ways of partitioning k into up to n parts each no more than 5, or into up to 5 parts each no more than n; as a triangle t(n,k), number of ways of partitioning n into exactly k parts each no more than 6 (i.e., of arranging k indistinguishable standard dice to produce a total of n).
 * @author Sean A. Irvine
 */
public class A069713 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    final FixedLengthPartition part = new FixedLengthPartition(n, m, 1, 6);
    long count = 0;
    while (part.next() != null) {
      ++count;
    }
    return Z.valueOf(count);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}


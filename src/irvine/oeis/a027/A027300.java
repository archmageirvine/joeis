package irvine.oeis.a027;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027300 Triangular array Q given by rows: Q(n,k) = number of partitions of n that do not contain k as an element; domain: 1 &lt;= k &lt;= n, n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A027300 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return IntegerPartition.partitions(mN).subtract(IntegerPartition.partitions(mN - mM));
  }
}


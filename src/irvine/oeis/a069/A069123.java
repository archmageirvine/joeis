package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069123 Triangle formed as follows: For n-th row, n &gt;= 0, record the A000041(n) partitions of n; for each partition, write down number of ways to arrange the parts.
 * @author Sean A. Irvine
 */
public class A069123 extends Sequence0 {

  private int mN = 0;
  private IntegerPartition mPartitions = new IntegerPartition(0);

  @Override
  public Z next() {
    int[] p = mPartitions.next();
    if (p == null) {
      mPartitions = new IntegerPartition(++mN);
      p = mPartitions.next();
    }
    Z prod = Z.ONE;
    for (final int v : p) {
      prod = prod.multiply(Functions.FACTORIAL.z(v));
    }
    return prod;
  }
}


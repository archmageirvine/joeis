package irvine.oeis.a241;
// manually 2026-09-03/partpred at 2026-09-03 19: 07

import irvine.math.partition.IntegerPartition;
import irvine.math.partition.PartitionUtils;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A241761 Number of partitions p = [x(1), ..., x(k)], where x(1) &gt;= x(2) &gt;=  ... &gt;= x(k), of n such that min(x(i) - x(i-1))  is not a part of p.
 * @author Georg Fischer
 */
public class A241761 extends LambdaSequence {

  /** Construct the sequence. */
  public A241761() {
    super(0, n -> (n == 0) ? Z.ONE : IntegerPartition.count(Math.toIntExact(n), p -> !PartitionUtils.isPart(p, PartitionUtils.minDiff(p))).add(1));
  }
}

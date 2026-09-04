package irvine.oeis.a241;
// manually 2026-09-03/partpre0 at 2026-09-03 16: 58

import irvine.math.partition.IntegerPartition;
import irvine.math.partition.PartitionUtils;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A241825 Number of partitions p = [x(1), ..., x(k)], where x(1) &gt;= x(2) &gt;=  ... &gt;= x(k), of n such that min(x(i) - x(i-1)) = number of distinct parts of p.
 * @author Georg Fischer
 */
public class A241825 extends LambdaSequence {

  /** Construct the sequence. */
  public A241825() {
    super(0, n -> (n <= 1) ? Z.ZERO : IntegerPartition.count(Math.toIntExact(n), p -> PartitionUtils.minDiff(p) == PartitionUtils.distinctCount(p)));
  }
}

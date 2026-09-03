package irvine.oeis.a241;
// manually 2026-09-02/pardpred at 2026-09-02 22: 53
import irvine.math.partition.DistinctPartsPartition;
import irvine.math.partition.PartitionUtils;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A241316 Number of partitions p of n into distinct parts, including round(mean(p)).
 * @author Georg Fischer
 */
public class A241316 extends LambdaSequence {

  /** Construct the sequence. */
  public A241316() {
    super(0, n -> (n == 0) ? Z.ZERO : DistinctPartsPartition.count(Math.toIntExact(n), p -> PartitionUtils.isPart(p, PartitionUtils.mean(p).bankersRound().intValueExact())));
  }
}

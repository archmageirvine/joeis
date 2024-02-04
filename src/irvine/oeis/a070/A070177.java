package irvine.oeis.a070;
// manually 2024-02-03

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A070177 a(n) = number of partitions of 10^n.
 * @author Georg Fischer
 */
public class A070177 extends LambdaSequence {

  /** Construct the sequence. */
  public A070177() {
    super(0, n -> IntegerPartition.partitions(Z.TEN.pow(n).intValueExact()));
  }
}

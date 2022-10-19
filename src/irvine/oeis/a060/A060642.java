package irvine.oeis.a060;

import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A060642 Triangle read by rows: row n lists number of ordered partitions into k parts of partitions of n.
 * @author Georg Fischer
 */
public class A060642 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A060642() {
    super(1, new SkipSequence(new A000041(), 1));
  }
}

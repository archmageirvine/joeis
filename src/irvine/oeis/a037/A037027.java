package irvine.oeis.a037;
// manually partran at 2022-10-03 08:24

import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A037027 Skew Fibonacci-Pascal triangle read by rows.
 * @author Georg Fischer
 */
public class A037027 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A037027() {
    super(0, new SkipSequence(new A000045(), 1));
  }
}

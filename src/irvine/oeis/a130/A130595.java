package irvine.oeis.a130;
// manually partran at 2022-10-03 20:38

import irvine.oeis.a033.A033999;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A130595 Triangle read by rows: lower triangular matrix which is inverse to Pascal's triangle (A007318) regarded as a lower triangular matrix.
 * @author Georg Fischer
 */
public class A130595 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A130595() {
    super(0, new A033999());
  }
}

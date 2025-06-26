package irvine.oeis.a337;
// manually partran at 2025-06-25

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a005.A005169;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A337048 Triangle T(n,k) read by rows: the number of fountains of n coins composed of k inseparable fountains of coins placed side-by-side.
 * @author Georg Fischer
 */
public class A337048 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A337048() {
    super(1, new PolynomialFieldSequence(1, "[1]", "1,1,x,B,/,-,1,+", 0, 0, 1, 1, new A005169()));
  }
}

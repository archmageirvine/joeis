package irvine.oeis.a337;
// manually partran at 2022-10-18 05:00

import irvine.oeis.a005.A005169;
import irvine.oeis.transform.InverseInvertTransform;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A337048 Triangle T(n,k) read by rows: the number of fountains of n coins composed of k inseparable fountains of coins placed side-by-side.
 * @author Georg Fischer
 */
public class A337048 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A337048() {
    super(1, new InverseInvertTransform(0, new A005169(), 1));
  }
}

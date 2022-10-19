package irvine.oeis.a101;
// manually partran at 2022-10-03 20:38

import irvine.oeis.a010.A010892;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A101950 Product of A049310 and A007318 as lower triangular matrices.
 * @author Georg Fischer
 */
public class A101950 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A101950() {
    super(0, new A010892());
  }
}

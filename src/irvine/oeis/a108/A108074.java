package irvine.oeis.a108;
// manually partran at 2023-05-07 14:37

import irvine.oeis.a071.A071969;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A108074 Triangle in A071944 with rows reversed.
 * @author Georg Fischer
 */
public class A108074 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A108074() {
    super(0, new A071969());
  }
}

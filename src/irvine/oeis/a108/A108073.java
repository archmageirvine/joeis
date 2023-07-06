package irvine.oeis.a108;
// manually partran at 2022-10-03 20:38

import irvine.oeis.a052.A052709;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A108073 Triangle in A071943 with rows reversed.
 * @author Georg Fischer
 */
public class A108073 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A108073() {
    super(0, new A052709().skip(1));
  }
}

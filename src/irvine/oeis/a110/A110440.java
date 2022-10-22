package irvine.oeis.a110;
// manually partrapl/partran at 2022-10-20 14:23

import irvine.oeis.a001.A001003;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A110440 Triangular array formed by the little Schr\u00f6der numbers s(n,k).
 * @author Georg Fischer
 */
public class A110440 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A110440() {
    super(0, new A001003(), 1);
  }
}

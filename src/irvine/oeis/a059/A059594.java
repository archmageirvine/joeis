package irvine.oeis.a059;
// manually partran at 2022-10-03 08:24

import irvine.oeis.a008.A008619;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A059594 Convolution triangle based on A008619 (positive integers repeated).
 * @author Georg Fischer
 */
public class A059594 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A059594() {
    super(0, new A008619());
  }
}

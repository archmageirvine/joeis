package irvine.oeis.a127;
// manually partrapl/partran at 2022-10-20 15:48

import irvine.oeis.a001.A001764;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A127898 Inverse of Riordan array (1/(1+x)^3, x/(1+x)^3).
 * @author Georg Fischer
 */
public class A127898 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A127898() {
    super(0, new A001764(), 1);
  }
}

package irvine.oeis.a113;
// manually partran at 2022-10-03 20:38

import irvine.oeis.a040.A040000;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A113413 A Riordan array of coordination sequences.
 * @author Georg Fischer
 */
public class A113413 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A113413() {
    super(0, new A040000());
  }
}

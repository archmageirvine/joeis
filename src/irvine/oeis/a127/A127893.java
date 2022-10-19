package irvine.oeis.a127;
// manually partran at 2022-10-03 20:38

import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A127893 Riordan array (1/(1-x)^3, x/(1-x)^3).
 * @author Georg Fischer
 */
public class A127893 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A127893() {
    super(0, new SkipSequence(new A000217(), 1));
  }
}

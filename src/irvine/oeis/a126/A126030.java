package irvine.oeis.a126;
// manually partran at 2022-10-03 20:38

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A126030 Riordan array (1/(1+x^3),x/(1+x^3)).
 * @author Georg Fischer
 */
public class A126030 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A126030() {
    super(0, new PeriodicSequence(1, 0, 0, -1, 0, 0));
  }
}

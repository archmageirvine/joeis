package irvine.oeis.a156;
// manually partran at 2022-10-03 20:38

import irvine.oeis.a121.A121262;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A156062 Riordan array (1/(1-x^4), x/(1-x^4)).
 * @author Georg Fischer
 */
public class A156062 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A156062() {
    super(0, new A121262());
  }
}

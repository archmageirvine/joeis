package irvine.oeis.a156;
// manually partran at 2022-10-18 05:00

import irvine.oeis.a121.A121262;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A156064 Inverse of Riordan array (1/(1-x^4), x/(1-x^4)), A156062.
 * @author Georg Fischer
 */
public class A156064 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A156064() {
    super(0, new A121262(), 0, "i");
  }
}

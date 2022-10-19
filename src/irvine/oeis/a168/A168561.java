package irvine.oeis.a168;
// manually partran at 2022-10-03 20:38

import irvine.oeis.a059.A059841;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A168561 Riordan array (1/(1-x^2), x/(1-x^2)). Unsigned version of A049310.
 * @author Georg Fischer
 */
public class A168561 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A168561() {
    super(0, new A059841());
  }
}

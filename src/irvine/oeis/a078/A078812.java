package irvine.oeis.a078;
// manually partran at 2022-10-03 08:24

import irvine.oeis.a000.A000027;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A078812 Triangle read by rows: T(n, k) = binomial(n+k-1, 2*k-1).
 * @author Georg Fischer
 */
public class A078812 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A078812() {
    super(0, new A000027());
  }
}

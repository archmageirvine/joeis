package irvine.oeis.a030;
// manually partran at 2022-10-03 08:24

import irvine.oeis.a019.A019590;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A030528 Triangle read by rows: a(n,k) = binomial(k,n-k).
 * @author Georg Fischer
 */
public class A030528 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A030528() {
    super(1, new A019590());
  }
}

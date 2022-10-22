package irvine.oeis.a073;
// manually partrapl/partran at 2022-10-20 15:48

import irvine.oeis.a002.A002605;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A073387 Convolution triangle of A002605(n) (generalized (2,2)-Fibonacci), n&gt;=0.
 * @author Georg Fischer
 */
public class A073387 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A073387() {
    super(0, new A002605(), 1);
  }
}

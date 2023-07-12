package irvine.oeis.a075;

import irvine.oeis.a000.A000984;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A075435 T(n,k) = right- or upward-moving paths connecting opposite corners of an n X n chessboard, visiting the diagonal at k points between start and finish.
 * @author Georg Fischer
 */
public class A075435 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A075435() {
    super(0, new A000984(), 1);
    setOffset(2);
  }
}

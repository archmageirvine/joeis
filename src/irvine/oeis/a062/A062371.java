package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a051.A051801;

/**
 * A062371 Numbers the product of whose nonzero digits is a perfect square.
 * @author Sean A. Irvine
 */
public class A062371 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A062371() {
    super(1, 1, new A051801().skip(1), Z::isSquare);
  }
}

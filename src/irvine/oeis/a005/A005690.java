package irvine.oeis.a005;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A005690 Number of Twopins positions.
 * @author Sean A. Irvine
 */
public class A005690 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A005690() {
    super(RING.one(), Polynomial.create(1, -2, 0, 2, -1, 0, -2, 2, 0, 0, 0, 0, 1));
  }
}

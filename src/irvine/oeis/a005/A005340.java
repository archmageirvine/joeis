package irvine.oeis.a005;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A005340 Number of ways in which n identical balls can be distributed among 7 boxes in a row such that each pair of adjacent boxes contains at least 4 balls.
 * @author Sean A. Irvine
 */
public class A005340 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A005340() {
    super(Polynomial.create(1, 6, 6, 1, 0, -66, 74, -21), RING.pow(Polynomial.create(1, -1), 7));
  }
}

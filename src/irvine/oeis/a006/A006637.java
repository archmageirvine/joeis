package irvine.oeis.a006;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A006637 From generalized Catalan numbers.
 * @author Sean A. Irvine
 */
public class A006637 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A006637() {
    super(RING.pow(Polynomial.create(2, -1), 4), RING.pow(Polynomial.create(-1, 1), 8));
  }
}

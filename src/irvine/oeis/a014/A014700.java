package irvine.oeis.a014;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A014700 Poincar&#233; series [or Poincare <code>series] (or</code> Molien series) for <code>mod 2</code> cohomology of universal <code>W-group W(5)</code>.
 * @author Sean A. Irvine
 */
public class A014700 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A014700() {
    super(Polynomial.create(1, 5, 40, 176, 440, 835, 1423, 1980, 1980, 1423, 835, 440, 176, 40, 5, 1),
      RING.pow(RING.oneMinusXToTheN(2), 15));
  }
}

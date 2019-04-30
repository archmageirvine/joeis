package irvine.oeis.a014;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A014697 Poincar&#233; series [or Poincare series] (or Molien series) for <code>mod 2</code> cohomology of universal W-group <code>W(4)</code>.
 * @author Sean A. Irvine
 */
public class A014697 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A014697() {
    super(Polynomial.create(1, 4, 20, 56, 84, 90, 84, 56, 20, 4, 1), RING.pow(RING.oneMinusXToTheN(2), 10));
  }
}


package irvine.oeis.a160;

import irvine.oeis.FiniteSequence;

/**
 * A160369 Largest base 10 near-repdigit (all but one digit alike) prime with digit n repeated n times (or 0, if no such prime exists).
 * @author Georg Fischer
 */
public class A160369 extends FiniteSequence {

  /** Construct the sequence. */
  public A160369() {
    super(1, FINITE, 71, 229, 7333, 44449, 555557, 0, 77777747, 888888887L, 9999999929L);
  }
}

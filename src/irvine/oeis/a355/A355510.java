package irvine.oeis.a355;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355510 a(n) is the number of monic polynomials of degree n over GF(7) without linear factors.
 * @author Georg Fischer
 */
public class A355510 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355510() {
    super(0, "[0,7,-1]", "0,0,21,112,819,5712,39991,279936", 0);
  }
}

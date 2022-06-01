package irvine.oeis.a011;

import irvine.oeis.recur.PeriodicSequence;

/**
 * A011751 Expansion of (1 + x^4)/(1 + x + x^3 + x^4 + x^5) mod 2.
 * @author Sean A. Irvine
 */
public class A011751 extends PeriodicSequence {

  /** Construct the sequence. */
  public A011751() {
    super(1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1);
  }
}

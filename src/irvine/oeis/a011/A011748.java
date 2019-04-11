package irvine.oeis.a011;

import irvine.oeis.PeriodicSequence;

/**
 * A011748 Expansion of <code>(1 + x^2 + x^4)/(1 + x + x^2 + x^4 + x^5) mod 2</code>.
 * @author Sean A. Irvine
 */
public class A011748 extends PeriodicSequence {

  /** Construct the sequence. */
  public A011748() {
    super(1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1);
  }
}

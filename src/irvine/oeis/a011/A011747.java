package irvine.oeis.a011;

import irvine.oeis.PeriodicSequence;

/**
 * A011747 Expansion of (1 + x^2 + x^4)/(1 + x^2 + x^3 + x^4 + x^5) mod 2.
 * @author Sean A. Irvine
 */
public class A011747 extends PeriodicSequence {

  /** Construct the sequence. */
  public A011747() {
    super(1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1);
  }
}

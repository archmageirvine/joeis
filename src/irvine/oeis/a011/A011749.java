package irvine.oeis.a011;

import irvine.oeis.PeriodicSequence;

/**
 * A011749 Expansion of <code>1/(1 + x^3 + x^5) mod 2</code>.
 * @author Sean A. Irvine
 */
public class A011749 extends PeriodicSequence {

  /** Construct the sequence. */
  public A011749() {
    super(1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0);
  }
}

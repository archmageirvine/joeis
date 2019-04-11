package irvine.oeis.a011;

import irvine.oeis.PeriodicSequence;

/**
 * A011746 Expansion of <code>(1 + x^2)/(1 + x^2 + x^5) mod 2</code>.
 * @author Sean A. Irvine
 */
public class A011746 extends PeriodicSequence {

  /** Construct the sequence. */
  public A011746() {
    super(1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0);
  }
}

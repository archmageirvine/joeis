package irvine.oeis.a115;

import irvine.oeis.FiniteSequence;

/**
 * A115100 Mayan calendar periods in days.
 * @author Georg Fischer
 */
public class A115100 extends FiniteSequence {

  /** Construct the sequence. */
  public A115100() {
    super(1, FINITE, 1, 20, 360, 7200, 144000, 1872000);
  }
}

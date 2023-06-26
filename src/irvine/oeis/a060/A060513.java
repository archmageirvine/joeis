package irvine.oeis.a060;

import irvine.oeis.FiniteSequence;

/**
 * A060513 Number of units of time making up the next larger unit: seconds, minutes, hours, days, years, centuries, millennia.
 * @author Georg Fischer
 */
public class A060513 extends FiniteSequence {

  /** Construct the sequence. */
  public A060513() {
    super(1, FINITE, 60, 60, 24, 365, 100, 10);
  }
}

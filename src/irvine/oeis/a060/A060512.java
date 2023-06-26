package irvine.oeis.a060;

import irvine.oeis.FiniteSequence;

/**
 * A060512 Number of units of time making up the next larger unit: seconds, minutes, hours, days, weeks, years, centuries, millennia.
 * @author Georg Fischer
 */
public class A060512 extends FiniteSequence {

  /** Construct the sequence. */
  public A060512() {
    super(1, FINITE, 60, 60, 24, 7, 52, 100, 10);
  }
}

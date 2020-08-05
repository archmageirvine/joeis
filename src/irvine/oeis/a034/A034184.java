package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034184 Not necessarily symmetric <code>n X 3</code> crossword puzzle grids.
 * @author Sean A. Irvine
 */
public class A034184 extends LinearRecurrence {

  // WARNING: Conjectural

  /** Construct the sequence. */
  public A034184() {
    super(
      new long[] {1, -6, -9, 29, -15, -21, 45, -33, 10},
      new long[] {1, 15, 111, 649, 3495, 18189, 93231, 474479, 2406621}
    );
  }
}


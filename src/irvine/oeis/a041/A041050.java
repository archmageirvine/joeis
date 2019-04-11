package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041050 Numerators of continued fraction convergents to <code>sqrt(31)</code>.
 * @author Sean A. Irvine
 */
public class A041050 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041050() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 3040, 0, 0, 0, 0, 0, 0, 0}, new long[] {5, 6, 11, 39, 206, 657, 863, 1520, 16063, 17583, 33646, 118521, 626251, 1997274, 2623525, 4620799});
  }
}

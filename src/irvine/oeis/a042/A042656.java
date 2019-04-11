package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042656 Numerators of continued fraction convergents to <code>sqrt(858)</code>.
 * @author Sean A. Irvine
 */
public class A042656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042656() {
    super(new long[] {-1, 0, 0, 0, 1406, 0, 0, 0}, new long[] {29, 88, 205, 703, 40979, 123640, 288259, 988417});
  }
}

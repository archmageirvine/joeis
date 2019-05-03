package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254375 Digital roots of centered heptagonal numbers <code>(A069099)</code>.
 * @author Sean A. Irvine
 */
public class A254375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254375() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 8, 4, 7, 8, 7, 4, 8, 1});
  }
}

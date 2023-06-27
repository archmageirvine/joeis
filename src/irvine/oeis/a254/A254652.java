package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254652 Indices of pentagonal numbers (A000326) which are also centered heptagonal numbers (A069099).
 * @author Sean A. Irvine
 */
public class A254652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254652() {
    super(1, new long[] {1, -1, -110, 110, 1}, new long[] {1, 4, 88, 421, 9661});
  }
}

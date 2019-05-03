package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254652 Indices of pentagonal numbers <code>(A000326)</code> which are also centered heptagonal numbers <code>(A069099)</code>.
 * @author Sean A. Irvine
 */
public class A254652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254652() {
    super(new long[] {1, -1, -110, 110, 1}, new long[] {1, 4, 88, 421, 9661});
  }
}

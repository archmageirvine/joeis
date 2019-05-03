package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254965 Indices of centered hexagonal numbers <code>(A003215)</code> that are also heptagonal numbers <code>(A000566)</code>.
 * @author Sean A. Irvine
 */
public class A254965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254965() {
    super(new long[] {1, -1, -22, 22, 1}, new long[] {1, 2, 13, 34, 275});
  }
}

package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254966 Heptagonal numbers <code>(A000566)</code> that are also centered hexagonal numbers <code>(A003215)</code>.
 * @author Sean A. Irvine
 */
public class A254966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254966() {
    super(new long[] {1, -1, -482, 482, 1}, new long[] {1, 7, 469, 3367, 226051});
  }
}

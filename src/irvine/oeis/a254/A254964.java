package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254964 Indices of heptagonal numbers <code>(A000566)</code> that are also centered hexagonal numbers <code>(A003215)</code>.
 * @author Sean A. Irvine
 */
public class A254964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254964() {
    super(new long[] {1, -1, -22, 22, 1}, new long[] {1, 2, 14, 37, 301});
  }
}

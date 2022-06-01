package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254964 Indices of heptagonal numbers (A000566) that are also centered hexagonal numbers (A003215).
 * @author Sean A. Irvine
 */
public class A254964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254964() {
    super(new long[] {1, -1, -22, 22, 1}, new long[] {1, 2, 14, 37, 301});
  }
}

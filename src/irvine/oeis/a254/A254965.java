package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254965 Indices of centered hexagonal numbers (A003215) that are also heptagonal numbers (A000566).
 * @author Sean A. Irvine
 */
public class A254965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254965() {
    super(1, new long[] {1, -1, -22, 22, 1}, new long[] {1, 2, 13, 34, 275});
  }
}

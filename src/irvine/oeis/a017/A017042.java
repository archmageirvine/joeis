package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017042 a(n) = (7*n + 5)^2.
 * @author Sean A. Irvine
 */
public class A017042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017042() {
    super(new long[] {1, -3, 3}, new long[] {25, 144, 361});
  }
}

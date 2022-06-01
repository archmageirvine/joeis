package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017305 a(n) = 10n + 3.
 * @author Sean A. Irvine
 */
public class A017305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017305() {
    super(new long[] {-1, 2}, new long[] {3, 13});
  }
}

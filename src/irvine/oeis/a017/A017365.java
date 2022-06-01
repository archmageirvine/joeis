package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017365 a(n) = 10n + 8.
 * @author Sean A. Irvine
 */
public class A017365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017365() {
    super(new long[] {-1, 2}, new long[] {8, 18});
  }
}

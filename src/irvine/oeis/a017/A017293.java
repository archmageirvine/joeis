package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017293 a(n) = 10n+2.
 * @author Sean A. Irvine
 */
public class A017293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017293() {
    super(new long[] {-1, 2}, new long[] {2, 12});
  }
}

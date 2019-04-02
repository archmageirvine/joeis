package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017353 a(n) = 10n + 7.
 * @author Sean A. Irvine
 */
public class A017353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017353() {
    super(new long[] {-1, 2}, new long[] {7, 17});
  }
}

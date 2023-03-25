package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034524 a(n) = 11^n + 1.
 * @author Sean A. Irvine
 */
public class A034524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034524() {
    super(new long[] {-11, 12}, new long[] {2, 12});
  }
}

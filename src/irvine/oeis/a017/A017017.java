package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017017 a(n) = 7*n + 3.
 * @author Sean A. Irvine
 */
public class A017017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017017() {
    super(new long[] {-1, 2}, new long[] {3, 10});
  }
}

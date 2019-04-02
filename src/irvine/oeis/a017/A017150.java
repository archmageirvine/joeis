package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017150 a(n) = (8*n + 7)^2.
 * @author Sean A. Irvine
 */
public class A017150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017150() {
    super(new long[] {1, -3, 3}, new long[] {49, 225, 529});
  }
}

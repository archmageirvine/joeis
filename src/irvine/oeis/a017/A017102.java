package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017102 a(n) = (8n + 3)^2.
 * @author Sean A. Irvine
 */
public class A017102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017102() {
    super(new long[] {1, -3, 3}, new long[] {9, 121, 361});
  }
}

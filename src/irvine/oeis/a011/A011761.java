package irvine.oeis.a011;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A011761 a(n) = a(n-1) + a(n-3), with a(0) = a(1) = 1, a(2) = 5.
 * @author Sean A. Irvine
 */
public class A011761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011761() {
    super(new long[] {1, 0, 1}, new long[] {1, 1, 5});
  }
}

package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173089 a(n) = 25*n^2 + n.
 * @author Sean A. Irvine
 */
public class A173089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173089() {
    super(1, new long[] {1, -3, 3}, new long[] {26, 102, 228});
  }
}

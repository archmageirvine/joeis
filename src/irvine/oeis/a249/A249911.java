package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249911 60-gonal (hexacontagonal) numbers: <code>a(n) = n(29n - 28)</code>.
 * @author Sean A. Irvine
 */
public class A249911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249911() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 60});
  }
}

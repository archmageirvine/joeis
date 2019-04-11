package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152965 Twice 12-gonal numbers: <code>a(n) = 2*n*(5*n-4)</code>.
 * @author Sean A. Irvine
 */
public class A152965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152965() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 24});
  }
}

package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211412 <code>a(n) = 4*n^4 + 1</code>.
 * @author Sean A. Irvine
 */
public class A211412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211412() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {5, 65, 325, 1025, 2501});
  }
}

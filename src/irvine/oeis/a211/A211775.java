package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211775 a(n) = 2*n^2 - 212*n + 5419.
 * @author Sean A. Irvine
 */
public class A211775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211775() {
    super(new long[] {1, -3, 3}, new long[] {5419, 5209, 5003});
  }
}

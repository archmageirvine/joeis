package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060834 a(n) = 6*n^2 + 6*n + 31.
 * @author Sean A. Irvine
 */
public class A060834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060834() {
    super(new long[] {1, -3, 3}, new long[] {31, 43, 67});
  }
}

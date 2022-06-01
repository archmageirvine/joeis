package irvine.oeis.a240;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A240930 a(n) = n^7 - n^6.
 * @author Sean A. Irvine
 */
public class A240930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240930() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 64, 1458, 12288, 62500, 233280, 705894});
  }
}

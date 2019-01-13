package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054621.
 * @author Sean A. Irvine
 */
public class A054621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054621() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 20, 315, 2344, 11165, 39996, 117655});
  }
}

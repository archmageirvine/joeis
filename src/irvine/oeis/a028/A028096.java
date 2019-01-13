package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028096.
 * @author Sean A. Irvine
 */
public class A028096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028096() {
    super(new long[] {-2310, 1541, -341, 31}, new long[] {1, 31, 620, 10190});
  }
}

package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173237 Alternate k and 10k for each k.
 * @author Sean A. Irvine
 */
public class A173237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173237() {
    super(1, new long[] {-1, 0, 2, 0}, new long[] {1, 10, 2, 20});
  }
}

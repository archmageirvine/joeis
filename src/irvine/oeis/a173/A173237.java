package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173237 Alternate n and 10n for each n.
 * @author Sean A. Irvine
 */
public class A173237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173237() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 10, 2, 20});
  }
}

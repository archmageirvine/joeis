package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173714.
 * @author Sean A. Irvine
 */
public class A173714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173714() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {0, 1, 2, 3, 5});
  }
}

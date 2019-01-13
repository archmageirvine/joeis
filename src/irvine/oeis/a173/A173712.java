package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173712.
 * @author Sean A. Irvine
 */
public class A173712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173712() {
    super(new long[] {-10, 0, 11, 0}, new long[] {1, 4, 16, 49});
  }
}

package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173432.
 * @author Sean A. Irvine
 */
public class A173432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173432() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 1, 2, 1});
  }
}

package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289120.
 * @author Sean A. Irvine
 */
public class A289120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289120() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 1, 0, 1, 2, 1, 2});
  }
}

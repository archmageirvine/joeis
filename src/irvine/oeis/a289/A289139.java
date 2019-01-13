package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289139.
 * @author Sean A. Irvine
 */
public class A289139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289139() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 1, 2, 2, 2, 3, 4});
  }
}

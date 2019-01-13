package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246552.
 * @author Sean A. Irvine
 */
public class A246552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246552() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 0, 1, 2, 1});
  }
}

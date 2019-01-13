package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117748.
 * @author Sean A. Irvine
 */
public class A117748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117748() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 3, 6, 15, 21});
  }
}

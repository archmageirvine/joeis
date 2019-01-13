package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177825.
 * @author Sean A. Irvine
 */
public class A177825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177825() {
    super(new long[] {-1, 2, -1, 0, 1}, new long[] {1, 1, 1, 0, 1});
  }
}

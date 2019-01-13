package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260307.
 * @author Sean A. Irvine
 */
public class A260307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260307() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 1, 0}, new long[] {1, 2, 3, 4, 6, 5, 8, 7});
  }
}

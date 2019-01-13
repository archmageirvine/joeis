package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232164.
 * @author Sean A. Irvine
 */
public class A232164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232164() {
    super(new long[] {1, 3, 1, 1}, new long[] {0, 1, 1, 2});
  }
}

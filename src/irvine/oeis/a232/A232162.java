package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232162.
 * @author Sean A. Irvine
 */
public class A232162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232162() {
    super(new long[] {1, 3, 1, 1}, new long[] {0, 0, 2, 3});
  }
}

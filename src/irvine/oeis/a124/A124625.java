package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124625 Even numbers sandwiched between 1's.
 * @author Sean A. Irvine
 */
public class A124625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124625() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 0, 1, 2});
  }
}

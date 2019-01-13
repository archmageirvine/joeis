package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195020.
 * @author Sean A. Irvine
 */
public class A195020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195020() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 3, 7, 13, 21});
  }
}

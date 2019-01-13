package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098921.
 * @author Sean A. Irvine
 */
public class A098921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098921() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 9, 62, 211, 534, 1127});
  }
}

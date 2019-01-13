package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185395.
 * @author Sean A. Irvine
 */
public class A185395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185395() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {0, 0, 0, 1, 3, 3, 4, 9, 9});
  }
}

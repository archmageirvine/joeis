package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186101.
 * @author Sean A. Irvine
 */
public class A186101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186101() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 2, 2, 4, 5});
  }
}

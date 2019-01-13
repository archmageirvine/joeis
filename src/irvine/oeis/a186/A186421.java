package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186421.
 * @author Sean A. Irvine
 */
public class A186421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186421() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {0, 1, 2, 1, 4, 3});
  }
}

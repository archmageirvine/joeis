package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143438.
 * @author Sean A. Irvine
 */
public class A143438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143438() {
    super(new long[] {-1, 0, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 2});
  }
}

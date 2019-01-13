package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080455.
 * @author Sean A. Irvine
 */
public class A080455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080455() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 5, 9, 13, 13});
  }
}

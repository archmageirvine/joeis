package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070260.
 * @author Sean A. Irvine
 */
public class A070260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070260() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {3, 2, 15, 6, 35, 12});
  }
}

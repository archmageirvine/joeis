package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120461.
 * @author Sean A. Irvine
 */
public class A120461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120461() {
    super(new long[] {-2, 3, 1}, new long[] {0, 4, 3});
  }
}

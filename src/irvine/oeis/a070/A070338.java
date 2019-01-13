package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070338.
 * @author Sean A. Irvine
 */
public class A070338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070338() {
    super(new long[] {1, -1, 0, 0, 0, 1}, new long[] {1, 2, 4, 8, 16, 32});
  }
}

package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070550.
 * @author Sean A. Irvine
 */
public class A070550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070550() {
    super(new long[] {1, 1, 0, 1}, new long[] {1, 2, 2, 3});
  }
}

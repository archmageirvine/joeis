package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070690.
 * @author Sean A. Irvine
 */
public class A070690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070690() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {0, 1, 3, 2, 4});
  }
}

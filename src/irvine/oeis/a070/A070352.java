package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070352.
 * @author Sean A. Irvine
 */
public class A070352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070352() {
    super(new long[] {1, -1, 1}, new long[] {1, 3, 4});
  }
}

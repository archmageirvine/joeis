package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070471.
 * @author Sean A. Irvine
 */
public class A070471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070471() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {0, 1, 3, 2, 4});
  }
}

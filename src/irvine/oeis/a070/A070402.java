package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070402.
 * @author Sean A. Irvine
 */
public class A070402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070402() {
    super(new long[] {1, -1, 1}, new long[] {1, 2, 4});
  }
}

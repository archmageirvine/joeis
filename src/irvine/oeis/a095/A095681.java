package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095681.
 * @author Sean A. Irvine
 */
public class A095681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095681() {
    super(new long[] {1, 1, -1, -2, -1, 3}, new long[] {1, 3, 8, 19, 42, 89});
  }
}

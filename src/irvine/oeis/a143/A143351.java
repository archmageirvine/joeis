package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143351.
 * @author Sean A. Irvine
 */
public class A143351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143351() {
    super(new long[] {1, 1, 1, 1, 0, 0, 1, 0, 1, 0}, new long[] {1, 0, 1, 0, 2, 0, 3, 1, 6, 3});
  }
}

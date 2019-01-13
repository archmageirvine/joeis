package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079284.
 * @author Sean A. Irvine
 */
public class A079284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079284() {
    super(new long[] {-2, -2, 3, 1}, new long[] {1, 1, 3, 4});
  }
}

package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079963.
 * @author Sean A. Irvine
 */
public class A079963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079963() {
    super(new long[] {1, 1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 4});
  }
}

package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079955.
 * @author Sean A. Irvine
 */
public class A079955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079955() {
    super(new long[] {1, 1, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 1});
  }
}

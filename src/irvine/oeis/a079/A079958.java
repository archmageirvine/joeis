package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079958.
 * @author Sean A. Irvine
 */
public class A079958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079958() {
    super(new long[] {1, 0, 0, 1, 1, 1}, new long[] {1, 1, 2, 4, 7, 13});
  }
}

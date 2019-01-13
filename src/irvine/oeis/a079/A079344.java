package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079344.
 * @author Sean A. Irvine
 */
public class A079344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079344() {
    super(new long[] {1, -1, 0, 0, 1, -1, 0, 0, 1}, new long[] {0, 1, 1, 2, 3, 5, 0, 5, 5});
  }
}

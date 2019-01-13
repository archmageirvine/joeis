package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228344.
 * @author Sean A. Irvine
 */
public class A228344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228344() {
    super(new long[] {1, -2, 0, 2}, new long[] {2, 5, 11, 17});
  }
}

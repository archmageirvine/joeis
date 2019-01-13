package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052972.
 * @author Sean A. Irvine
 */
public class A052972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052972() {
    super(new long[] {-1, 0, 1, 1, 1}, new long[] {1, 1, 2, 3, 6});
  }
}

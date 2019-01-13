package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052959.
 * @author Sean A. Irvine
 */
public class A052959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052959() {
    super(new long[] {-1, -1, 2, 1}, new long[] {2, 1, 3, 3});
  }
}

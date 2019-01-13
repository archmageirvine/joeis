package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052911.
 * @author Sean A. Irvine
 */
public class A052911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052911() {
    super(new long[] {-2, 1, 3}, new long[] {1, 2, 7});
  }
}

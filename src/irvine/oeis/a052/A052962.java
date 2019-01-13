package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052962.
 * @author Sean A. Irvine
 */
public class A052962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052962() {
    super(new long[] {-2, 0, 3, 1}, new long[] {1, 1, 2, 5});
  }
}

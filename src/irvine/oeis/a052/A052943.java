package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052943.
 * @author Sean A. Irvine
 */
public class A052943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052943() {
    super(new long[] {-1, 0, 1, 2, 0}, new long[] {1, 0, 1, 1, 2});
  }
}

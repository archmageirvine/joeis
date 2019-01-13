package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052540.
 * @author Sean A. Irvine
 */
public class A052540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052540() {
    super(new long[] {-1, 1, 0, 2}, new long[] {1, 1, 2, 5});
  }
}

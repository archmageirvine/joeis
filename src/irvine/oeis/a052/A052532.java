package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052532.
 * @author Sean A. Irvine
 */
public class A052532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052532() {
    super(new long[] {-1, 1, 1, 0, 1}, new long[] {1, 0, 0, 1, 2});
  }
}

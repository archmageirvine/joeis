package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052762.
 * @author Sean A. Irvine
 */
public class A052762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052762() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 0, 0, 24});
  }
}

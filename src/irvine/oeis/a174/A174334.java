package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174334.
 * @author Sean A. Irvine
 */
public class A174334 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174334() {
    super(new long[] {1, -3, 3}, new long[] {0, 73, 292});
  }
}

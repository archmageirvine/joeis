package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196382.
 * @author Sean A. Irvine
 */
public class A196382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196382() {
    super(new long[] {-1, 1, -1, 2}, new long[] {0, 0, 2, 3});
  }
}

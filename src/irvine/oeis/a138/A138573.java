package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138573.
 * @author Sean A. Irvine
 */
public class A138573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138573() {
    super(new long[] {-1, 2, 2, 2}, new long[] {0, 1, 2, 5});
  }
}

package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138112.
 * @author Sean A. Irvine
 */
public class A138112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138112() {
    super(new long[] {-1, 2, -4, 3}, new long[] {0, 0, 0, 1});
  }
}

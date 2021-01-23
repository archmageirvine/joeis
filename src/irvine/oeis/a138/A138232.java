package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138232 First differences of A138231.
 * @author Sean A. Irvine
 */
public class A138232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138232() {
    super(new long[] {-2, 0, 2, 0}, new long[] {1, 0, 0, 1});
  }
}

package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138179.
 * @author Sean A. Irvine
 */
public class A138179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138179() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 8, 21, 48, 85, 144});
  }
}

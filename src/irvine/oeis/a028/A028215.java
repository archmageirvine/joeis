package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028215.
 * @author Sean A. Irvine
 */
public class A028215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028215() {
    super(new long[] {-6336, 2952, -502, 37}, new long[] {1, 37, 867, 16457});
  }
}

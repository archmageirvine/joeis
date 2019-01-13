package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277253.
 * @author Sean A. Irvine
 */
public class A277253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277253() {
    super(new long[] {1, 1, 1, 0}, new long[] {1, 0, 0, 2});
  }
}

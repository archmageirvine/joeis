package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023548.
 * @author Sean A. Irvine
 */
public class A023548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023548() {
    super(new long[] {1, -1, -2, 3}, new long[] {2, 5, 11, 21});
  }
}

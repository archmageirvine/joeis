package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132419.
 * @author Sean A. Irvine
 */
public class A132419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132419() {
    super(new long[] {-1, 0, 0}, new long[] {1, 1, -2});
  }
}

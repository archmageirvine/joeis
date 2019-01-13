package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037688.
 * @author Sean A. Irvine
 */
public class A037688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037688() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {1, 6, 24, 99, 397});
  }
}

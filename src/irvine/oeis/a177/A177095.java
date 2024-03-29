package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177095 9^n - 8.
 * @author Sean A. Irvine
 */
public class A177095 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177095() {
    super(1, new long[] {-9, 10}, new long[] {1, 73});
  }
}

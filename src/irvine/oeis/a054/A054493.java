package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054493 A Pellian-related recursive sequence.
 * @author Sean A. Irvine
 */
public class A054493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054493() {
    super(new long[] {1, -6, 6}, new long[] {1, 7, 36});
  }
}

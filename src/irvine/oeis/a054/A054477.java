package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054477 A Pellian-related sequence.
 * @author Sean A. Irvine
 */
public class A054477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054477() {
    super(new long[] {-1, 5}, new long[] {1, 13});
  }
}

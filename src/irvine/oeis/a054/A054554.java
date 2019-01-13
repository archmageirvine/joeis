package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054554.
 * @author Sean A. Irvine
 */
public class A054554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054554() {
    super(new long[] {1, -3, 3}, new long[] {1, 3, 13});
  }
}

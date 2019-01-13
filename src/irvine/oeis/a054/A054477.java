package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054477.
 * @author Sean A. Irvine
 */
public class A054477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054477() {
    super(new long[] {-1, 5}, new long[] {1, 13});
  }
}

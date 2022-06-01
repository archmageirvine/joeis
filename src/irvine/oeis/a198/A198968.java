package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198968 11*9^n-1.
 * @author Sean A. Irvine
 */
public class A198968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198968() {
    super(new long[] {-9, 10}, new long[] {10, 98});
  }
}

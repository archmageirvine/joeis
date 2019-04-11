package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198968 <code>11*9^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198968() {
    super(new long[] {-9, 10}, new long[] {10, 98});
  }
}

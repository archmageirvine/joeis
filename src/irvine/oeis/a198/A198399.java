package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198399 <code>9^n - 9*n</code>.
 * @author Sean A. Irvine
 */
public class A198399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198399() {
    super(new long[] {9, -19, 11}, new long[] {1, 0, 63});
  }
}

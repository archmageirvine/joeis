package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198848 11*6^n-1.
 * @author Sean A. Irvine
 */
public class A198848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198848() {
    super(new long[] {-6, 7}, new long[] {10, 65});
  }
}

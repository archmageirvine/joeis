package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198858 a(n) = 11*8^n-1.
 * @author Sean A. Irvine
 */
public class A198858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198858() {
    super(new long[] {-8, 9}, new long[] {10, 87});
  }
}

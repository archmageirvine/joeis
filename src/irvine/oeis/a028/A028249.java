package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028249 Molien series for complete weight enumerator of self-dual code over GF(4) containing <code>1^n</code>.
 * @author Sean A. Irvine
 */
public class A028249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028249() {
    super(new long[] {-1, 1, 1, 0, -1, -1, 2, -1, -1, 0, 1, 1}, new long[] {1, 1, 1, 2, 3, 3, 6, 7, 8, 11, 14, 15});
  }
}

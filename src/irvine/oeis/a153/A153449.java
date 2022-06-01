package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153449 11 times pentagonal numbers: 11*n*(3n-1)/2.
 * @author Sean A. Irvine
 */
public class A153449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153449() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 55});
  }
}

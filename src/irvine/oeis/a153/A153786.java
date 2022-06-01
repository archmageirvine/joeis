package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153786 6 times heptagonal numbers: a(n) = 3*n*(5*n-3).
 * @author Sean A. Irvine
 */
public class A153786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153786() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 42});
  }
}

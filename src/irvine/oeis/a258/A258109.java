package irvine.oeis.a258;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A258109 Number of balanced parenthesis expressions of length 2n and depth 3.
 * @author Sean A. Irvine
 */
public class A258109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258109() {
    super(3, new long[] {2, -7, 5}, new long[] {1, 5, 18});
  }
}

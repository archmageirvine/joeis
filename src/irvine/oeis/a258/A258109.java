package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258109 Number of balanced parenthesis expressions of length 2n and depth 3.
 * @author Sean A. Irvine
 */
public class A258109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258109() {
    super(new long[] {2, -7, 5}, new long[] {1, 5, 18});
  }
}

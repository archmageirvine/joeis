package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144065 Values of n such that the expression <code>sqrt(4!*(n+1) + 1)</code> yields <code>an</code> integer.
 * @author Sean A. Irvine
 */
public class A144065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144065() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 4, 6, 11});
  }
}

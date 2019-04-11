package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086113 Number of 3 X <code>n (0,1)</code> matrices such that each row and each column is nondecreasing or nonincreasing.
 * @author Sean A. Irvine
 */
public class A086113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086113() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 36, 102, 216});
  }
}

package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083040 Number of divisors of n that are &lt;= 4.
 * @author Sean A. Irvine
 */
public class A083040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083040() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 2, 3, 1, 3, 1, 3, 2, 2, 1, 4});
  }
}

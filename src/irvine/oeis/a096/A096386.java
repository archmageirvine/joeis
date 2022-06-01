package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096386 Number of numbers &lt;= n which are divisible by 2 or 3.
 * @author Sean A. Irvine
 */
public class A096386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096386() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 0, 1, 2, 3, 3, 4});
  }
}

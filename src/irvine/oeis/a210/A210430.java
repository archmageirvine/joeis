package irvine.oeis.a210;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A210430 Number of semistandard Young tableaux over all partitions of 8 with maximal element &lt;= n.
 * @author Sean A. Irvine
 */
public class A210430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210430() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 25, 294, 2090, 10460, 40677, 131131, 366088});
  }
}

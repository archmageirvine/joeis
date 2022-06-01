package irvine.oeis.a210;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A210432 Number of semistandard Young tableaux over all partitions of 10 with maximal element &lt;= n.
 * @author Sean A. Irvine
 */
public class A210432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210432() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1, 36, 630, 6512, 45628, 239316, 1007083, 3570240, 11042199, 30569012});
  }
}

package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165804 Numbers of the form i*8^j-1 (i=1..7, j &gt;= 0).
 * @author Sean A. Irvine
 */
public class A165804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165804() {
    super(new long[] {-8, 8, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7});
  }
}

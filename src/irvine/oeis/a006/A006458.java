package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006458 Number of elements in Z[ omega ] whose `smallest algorithm' is &lt;= n, where omega^2 = -omega - 1.
 * @author Sean A. Irvine
 */
public class A006458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006458() {
    super(new long[] {-6, 8, 4, -5, -5, 5}, new long[] {1, 7, 31, 115, 391, 1267});
  }
}


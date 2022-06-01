package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003411 Losing initial positions in game: two players alternate in removing &gt;= 1 stones; last player wins; first player may not remove all stones; each move &lt;= 3 times previous move.
 * @author Sean A. Irvine
 */
public class A003411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003411() {
    super(new long[] {0, 1, 0, 0, 1}, new long[] {1, 2, 3, 4, 6});
  }
}

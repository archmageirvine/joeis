package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293309 Number of magic labelings of the graph LOOP X C_10 (see comments) having magic sum n, n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A293309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293309() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 123, 3281, 39175, 286555, 1508401, 6271378, 21836366, 66220705, 179784715, 445824731});
  }
}

package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060894 n^8+n^7-n^5-n^4-n^3+n+1.
 * @author Sean A. Irvine
 */
public class A060894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060894() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 1, 331, 8401, 80581, 464881, 1950271, 6568801, 18837001});
  }
}

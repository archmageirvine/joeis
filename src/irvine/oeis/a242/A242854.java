package irvine.oeis.a242;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A242854 a(n) = 512*n^9 - 1024*n^7 + 672*n^5 - 160*n^3 + 10*n.
 * @author Sean A. Irvine
 */
public class A242854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242854() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 10, 151316, 7997214, 118118440, 922080050, 4878316860L, 19828978246L, 66593931344L, 193501094490L});
  }
}

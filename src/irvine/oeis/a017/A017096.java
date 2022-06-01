package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017096 a(n) = (8*n + 2)^8.
 * @author Sean A. Irvine
 */
public class A017096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017096() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {256, 100000000, 11019960576L, 208827064576L, 1785793904896L, 9682651996416L, 39062500000000L, 128063081718016L, 360040606269696L});
  }
}

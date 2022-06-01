package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017240 a(n) = (9*n + 6)^8.
 * @author Sean A. Irvine
 */
public class A017240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017240() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1679616, 2562890625L, 110075314176L, 1406408618241L, 9682651996416L, 45767944570401L, 167961600000000L, 513798374428641L, 1370114370683136L});
  }
}

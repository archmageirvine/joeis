package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017600 (12n+6)^8.
 * @author Sean A. Irvine
 */
public class A017600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017600() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1679616, 11019960576L, 656100000000L, 9682651996416L, 72301961339136L, 360040606269696L, 1370114370683136L, 4304672100000000L, 11716593810022656L});
  }
}

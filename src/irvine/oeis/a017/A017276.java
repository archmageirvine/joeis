package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017276 a(n) = (10*n)^8.
 * @author Sean A. Irvine
 */
public class A017276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017276() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 100000000, 25600000000L, 656100000000L, 6553600000000L, 39062500000000L, 167961600000000L, 576480100000000L, 1677721600000000L});
  }
}

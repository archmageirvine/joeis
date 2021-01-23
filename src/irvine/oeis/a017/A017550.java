package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017550 (12n+2)^6.
 * @author Sean A. Irvine
 */
public class A017550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017550() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {64, 7529536, 308915776, 3010936384L, 15625000000L, 56800235584L, 164206490176L});
  }
}

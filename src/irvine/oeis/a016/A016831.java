package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016831 (4n+2)^7.
 * @author Sean A. Irvine
 */
public class A016831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016831() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {128, 279936, 10000000, 105413504, 612220032, 2494357888L, 8031810176L, 21870000000L});
  }
}

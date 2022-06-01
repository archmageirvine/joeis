package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108495 a(n) = (n^7 - n)/6.
 * @author Sean A. Irvine
 */
public class A108495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108495() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 21, 364, 2730, 13020, 46655, 137256});
  }
}

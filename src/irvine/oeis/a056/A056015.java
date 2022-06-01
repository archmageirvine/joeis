package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056015 A recursive sequence.
 * @author Sean A. Irvine
 */
public class A056015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056015() {
    super(new long[] {1, 2, -3, -4, -5, 6}, new long[] {1, 6, 31, 152, 730, 3480});
  }
}

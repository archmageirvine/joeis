package irvine.oeis.a229;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A229593 Number of boomerang patterns appearing in n X n coins, rotation not allowed.
 * @author Sean A. Irvine
 */
public class A229593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229593() {
    super(2, new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, 2, 3, 4, 10, 12, 14});
  }
}

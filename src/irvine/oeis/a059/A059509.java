package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059509 Main diagonal of the array A059503.
 * @author Sean A. Irvine
 */
public class A059509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059509() {
    super(1, new long[] {-1, 6, -11, 6}, new long[] {1, 5, 19, 66});
  }
}

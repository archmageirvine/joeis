package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017129 a(n) = (8*n + 5)^5.
 * @author Sean A. Irvine
 */
public class A017129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017129() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {3125, 371293, 4084101, 20511149, 69343957, 184528125});
  }
}

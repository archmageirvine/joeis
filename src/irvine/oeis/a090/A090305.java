package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090305 a(n) = 16*a(n-1) + a(n-2), starting with a(0) = 2 and a(1) = 16.
 * @author Sean A. Irvine
 */
public class A090305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090305() {
    super(new long[] {1, 16}, new long[] {2, 16});
  }
}

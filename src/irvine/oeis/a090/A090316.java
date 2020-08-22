package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090316 a(n) = 24*a(n-1) + a(n-2), starting with a(0) = 2 and a(1) = 24.
 * @author Sean A. Irvine
 */
public class A090316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090316() {
    super(new long[] {1, 24}, new long[] {2, 24});
  }
}

package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140156 a(1)=1, a(n) = a(n-1) + n^3 if n odd, a(n) = a(n-1) + n^5 if n is even.
 * @author Sean A. Irvine
 */
public class A140156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140156() {
    super(new long[] {1, -1, -6, 6, 15, -15, -20, 20, 15, -15, -6, 6, 1}, new long[] {1, 33, 60, 1084, 1209, 8985, 9328, 42096, 42825, 142825, 144156, 392988, 395185});
  }
}

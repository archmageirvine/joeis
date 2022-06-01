package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164599 a(n) = 14*a(n-1) - 47*a(n-2), for n &gt; 1, with a(0) = 1, a(1) = 15.
 * @author Sean A. Irvine
 */
public class A164599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164599() {
    super(new long[] {-47, 14}, new long[] {1, 15});
  }
}

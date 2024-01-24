package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152599 a(n) = 10*a(n-1) - 12*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 4 .
 * @author Sean A. Irvine
 */
public class A152599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152599() {
    super(new long[] {-12, 10}, new long[] {1, 4});
  }
}

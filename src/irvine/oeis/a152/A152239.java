package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152239 a(n) = -5*a(n-1) + 7*a(n-2) for n &gt; 1 with a(0) = 1 and a(1) = -7.
 * @author Sean A. Irvine
 */
public class A152239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152239() {
    super(new long[] {7, -5}, new long[] {1, -7});
  }
}

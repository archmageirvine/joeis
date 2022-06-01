package irvine.oeis.a004;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A004254 a(n) = 5*a(n-1) - a(n-2) for n &gt; 1, a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A004254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A004254() {
    super(new long[]{-1, 5}, new long[] {0, 1});
  }
}

package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155464 a(n) = 7*a(n-1) - 7*a(n-2) + a(n-3) for n &gt; 2; a(0) = 0, a(1) = 51, a(2) = 340.
 * @author Sean A. Irvine
 */
public class A155464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155464() {
    super(new long[] {1, -7, 7}, new long[] {0, 51, 340});
  }
}

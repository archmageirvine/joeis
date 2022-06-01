package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171478 a(n) = 6*a(n-1) - 8*a(n-2) + 2 for n &gt; 1; a(0) = 1, a(1) = 8.
 * @author Sean A. Irvine
 */
public class A171478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171478() {
    super(new long[] {8, -14, 7}, new long[] {1, 8, 42});
  }
}

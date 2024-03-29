package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171473 a(n) = 6*a(n-1) - 8*a(n-2)-3 for n &gt; 1; a(0) = 35, a(1) = 135.
 * @author Sean A. Irvine
 */
public class A171473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171473() {
    super(new long[] {8, -14, 7}, new long[] {35, 135, 527});
  }
}

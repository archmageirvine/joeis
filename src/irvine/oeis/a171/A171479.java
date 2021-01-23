package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171479 a(n) = 6*a(n-1)-8*a(n-2)+3 for n &gt; 1; a(0) = 1, a(1) = 8.
 * @author Sean A. Irvine
 */
public class A171479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171479() {
    super(new long[] {8, -14, 7}, new long[] {1, 8, 43});
  }
}

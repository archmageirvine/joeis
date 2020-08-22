package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171472 a(n) = 6*a(n-1) - 8*a(n-2) for n &gt; 1; a(0) = 7, a(1) = 30.
 * @author Sean A. Irvine
 */
public class A171472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171472() {
    super(new long[] {-8, 6}, new long[] {7, 30});
  }
}

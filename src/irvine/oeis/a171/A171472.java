package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171472 <code>a(n) = 6*a(n-1) - 8*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 7, a(1) = 30</code>.
 * @author Sean A. Irvine
 */
public class A171472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171472() {
    super(new long[] {-8, 6}, new long[] {7, 30});
  }
}

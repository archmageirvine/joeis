package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171499 <code>a(n) = 6*a(n-1) - 8*a(n-2)</code> for <code>n &gt; 1; a(0) = 3, a(1) = 14</code>.
 * @author Sean A. Irvine
 */
public class A171499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171499() {
    super(new long[] {-8, 6}, new long[] {3, 14});
  }
}

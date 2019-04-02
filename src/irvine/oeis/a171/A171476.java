package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171476 a(n) = 6*a(n-1)-8*a(n-2) for n&gt;1, a(0)=1, a(1)=6.
 * @author Sean A. Irvine
 */
public class A171476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171476() {
    super(new long[] {-8, 6}, new long[] {1, 6});
  }
}

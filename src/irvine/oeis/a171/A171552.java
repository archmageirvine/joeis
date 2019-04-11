package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171552 <code>a(n)=2^n*floor((5-2n)/3)</code>.
 * @author Sean A. Irvine
 */
public class A171552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171552() {
    super(new long[] {-16, 8, 0, 2}, new long[] {1, 2, 0, -8});
  }
}

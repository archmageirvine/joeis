package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171231 <code>a(n) = (10*2^n + 3 - (-1)^n)/6</code>.
 * @author Sean A. Irvine
 */
public class A171231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171231() {
    super(new long[] {-2, 1, 2}, new long[] {2, 4, 7});
  }
}

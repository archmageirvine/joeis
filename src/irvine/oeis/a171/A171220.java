package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171220 <code>a(n) = (2n + 1)*5^n</code>.
 * @author Sean A. Irvine
 */
public class A171220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171220() {
    super(new long[] {-25, 10}, new long[] {1, 15});
  }
}

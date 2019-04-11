package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171590 <code>1+4^(n+1)-4*(-2)^n</code>.
 * @author Sean A. Irvine
 */
public class A171590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171590() {
    super(new long[] {-8, 6, 3}, new long[] {1, 25, 49});
  }
}

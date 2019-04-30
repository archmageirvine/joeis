package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097725 Chebyshev <code>U(n,x)</code> polynomial evaluated at <code>x=51</code>.
 * @author Sean A. Irvine
 */
public class A097725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097725() {
    super(new long[] {-1, 102}, new long[] {1, 102});
  }
}

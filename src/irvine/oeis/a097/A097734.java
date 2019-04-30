package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097734 Chebyshev <code>U(n,x)</code> polynomial evaluated at <code>x=129 = 3*43</code>.
 * @author Sean A. Irvine
 */
public class A097734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097734() {
    super(new long[] {-1, 258}, new long[] {1, 258});
  }
}

package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097316 Chebyshev <code>U(n,x)</code> polynomial evaluated at <code>x=33</code>.
 * @author Sean A. Irvine
 */
public class A097316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097316() {
    super(new long[] {-1, 66}, new long[] {1, 66});
  }
}

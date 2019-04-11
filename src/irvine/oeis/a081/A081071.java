package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081071 <code>a(n) =</code> Lucas(4*n+2)-2, or Lucas(2*n+1)^2.
 * @author Sean A. Irvine
 */
public class A081071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081071() {
    super(new long[] {1, -8, 8}, new long[] {1, 16, 121});
  }
}

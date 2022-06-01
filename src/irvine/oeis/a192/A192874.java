package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192874 Constant term in the reduction by (x^2 -&gt; x + 1) of the polynomial p(n,x) given in Comments.
 * @author Sean A. Irvine
 */
public class A192874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192874() {
    super(new long[] {4, -6, -5, 6, 2}, new long[] {1, 0, 4, 6, 26});
  }
}

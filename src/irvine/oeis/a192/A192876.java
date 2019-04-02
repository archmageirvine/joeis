package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192876 Constant term in the reduction by (x^2 -&gt; x + 1) of the polynomial p(n,x) given in Comments.
 * @author Sean A. Irvine
 */
public class A192876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192876() {
    super(new long[] {4, -6, -5, 6, 2}, new long[] {1, 1, 4, 9, 31});
  }
}

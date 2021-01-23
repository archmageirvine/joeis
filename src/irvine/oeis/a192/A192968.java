package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192968 Coefficient of x in the reduction by x^2 -&gt; x+1 of the polynomial p(n,x) defined at Comments.
 * @author Sean A. Irvine
 */
public class A192968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192968() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {0, 1, 1, 3, 7});
  }
}

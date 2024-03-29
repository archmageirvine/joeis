package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192975 Constant term of the reduction by x^2 -&gt; x+1 of the polynomial p(n,x) defined at Comments.
 * @author Sean A. Irvine
 */
public class A192975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192975() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 1, 8, 19});
  }
}

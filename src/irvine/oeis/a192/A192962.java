package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192962 Constant term of the reduction by x^2 -&gt; x+1 of the polynomial p(n,x) defined at Comments.
 * @author Sean A. Irvine
 */
public class A192962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192962() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 2, 7, 15});
  }
}

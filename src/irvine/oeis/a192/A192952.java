package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192952 Coefficient of x in the reduction by x^2 -&gt; x+1 of the polynomial p(n,x) defined at Comments.
 * @author Sean A. Irvine
 */
public class A192952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192952() {
    super(new long[] {1, -1, -2, 3}, new long[] {0, 1, 2, 7});
  }
}

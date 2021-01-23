package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192872 Constant term in the reduction by (x^2 -&gt; x+1) of the polynomial p(n,x) given in Comments.
 * @author Sean A. Irvine
 */
public class A192872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192872() {
    super(new long[] {1, -3, 0, 3}, new long[] {1, 0, 3, 4});
  }
}

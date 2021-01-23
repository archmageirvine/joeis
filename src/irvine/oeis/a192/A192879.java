package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192879 Coefficient of x in the reduction by (x^2 -&gt; x + 1) of the polynomial p(n,x) given in Comments.
 * @author Sean A. Irvine
 */
public class A192879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192879() {
    super(new long[] {-1, 2, 2}, new long[] {0, 1, 4});
  }
}

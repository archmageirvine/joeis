package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193005 Coefficient of x in the reduction by <code>x^2-&gt;x+1</code> of the polynomial <code>p(n,x)</code> defined at Comments.
 * @author Sean A. Irvine
 */
public class A193005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193005() {
    super(new long[] {1, -3, 1, 6, -9, 5}, new long[] {0, 1, 2, 11, 40, 115});
  }
}

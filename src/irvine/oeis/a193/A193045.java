package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193045 Coefficient of x in the reduction by <code>x^2-&gt;x+1</code> of the polynomial p(n,x) defined at Comments.
 * @author Sean A. Irvine
 */
public class A193045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193045() {
    super(new long[] {1, -3, 1, 6, -9, 5}, new long[] {0, 1, 1, 3, 8, 21});
  }
}

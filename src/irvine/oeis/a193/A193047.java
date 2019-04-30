package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193047 Coefficient of x in the reduction by <code>x^2-&gt;x+1</code> of the polynomial <code>p(n,x)</code> defined at Comments.
 * @author Sean A. Irvine
 */
public class A193047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193047() {
    super(new long[] {-1, 4, -4, -5, 15, -14, 6}, new long[] {0, 1, 2, 19, 102, 377, 1104});
  }
}

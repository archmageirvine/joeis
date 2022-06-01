package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193047 Coefficient of x in the reduction by x^2-&gt;x+1 of the polynomial p(n,x) defined at Comments.
 * @author Sean A. Irvine
 */
public class A193047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193047() {
    super(new long[] {-1, 4, -4, -5, 15, -14, 6}, new long[] {0, 1, 2, 19, 102, 377, 1104});
  }
}

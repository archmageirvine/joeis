package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193004 Constant term of the reduction by x^2-&gt;x+1 of the polynomial p(n,x) defined at Comments.
 * @author Sean A. Irvine
 */
public class A193004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193004() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 1, 9, 29, 75});
  }
}

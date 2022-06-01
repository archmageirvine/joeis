package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193044 Constant term of the reduction by x^2-&gt;x+1 of the polynomial p(n,x) defined at Comments.
 * @author Sean A. Irvine
 */
public class A193044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193044() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 0, 2, 5, 13});
  }
}

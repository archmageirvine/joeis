package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193006 Constant term of the reduction by x^2-&gt;x+1 of the polynomial p(n,x) defined at Comments.
 * @author Sean A. Irvine
 */
public class A193006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193006() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 0, 8, 27, 72});
  }
}

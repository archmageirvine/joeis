package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193008 Constant term of the reduction by <code>x^2-&gt;x+1</code> of the polynomial p(n,x) defined at Comments.
 * @author Sean A. Irvine
 */
public class A193008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193008() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 2, 10, 31, 78});
  }
}

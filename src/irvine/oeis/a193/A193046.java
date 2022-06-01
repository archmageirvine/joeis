package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193046 Constant term of the reduction by x^2-&gt;x+1 of the polynomial p(n,x) defined at Comments.
 * @author Sean A. Irvine
 */
public class A193046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193046() {
    super(new long[] {1, -3, 1, 6, -9, 5}, new long[] {1, 1, 17, 83, 275, 727});
  }
}

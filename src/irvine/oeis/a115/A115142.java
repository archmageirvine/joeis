package irvine.oeis.a115;
// manually dfinite/holos at 2022-07-30 09:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A115142 Third convolution of A115140.
 * Recurrence +n*(n-3)*a(n) -2*(n-2)*(2*n-5)*a(n-1)=0.
 * @author Georg Fischer
 */
public class A115142 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A115142() {
    super(0, "[[0],[-20, 18,-4],[0,-3, 1]]", "1,-3, 0,-1", 0);
  }
}

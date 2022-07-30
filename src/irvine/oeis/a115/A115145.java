package irvine.oeis.a115;
// manually dfinite/holos at 2022-07-30 09:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A115145 Sixth convolution of A115140.
 * @author Georg Fischer
 */
public class A115145 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A115145() {
    super(0, "[[0],[-56, 30,-4],[0,-6, 1]]", "1,-6, 9,-2, 0, 0,-1", 0);
  }
}

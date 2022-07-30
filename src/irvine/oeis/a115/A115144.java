package irvine.oeis.a115;
// manually dfinite/holos at 2022-07-30 09:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A115144 Fifth convolution of A115140.
 * @author Georg Fischer
 */
public class A115144 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A115144() {
    super(0, "[[0],[-42, 26,-4],[0,-5, 1]]", "1,-5, 5, 0, 0,-1", 0);
  }
}

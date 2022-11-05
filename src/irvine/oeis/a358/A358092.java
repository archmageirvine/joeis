package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358092 Row sums of the convolution triangle of the Motzkin numbers (A202710).
 * @author Georg Fischer
 */
public class A358092 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358092() {
    super(0, "[[0],[-36,12],[-30,14],[3,-3],[3,-4],[0,1]]", "1,1,3,9,28", 0);
  }
}

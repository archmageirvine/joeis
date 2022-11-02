package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358092 Row sums of the convolution triangle of the Motzkin numbers (A202710).
 * @author Georg Fischer
 */
public class A358092 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358092() {
    super(0, "[[0],[1080,-396, 36],[1620,-714, 78],[294,-159, 21],[-330, 217,-35],[-42, 36,-6],[18,-26, 7],[0, 2,-1]]", "1, 1, 3", 0);
  }
}

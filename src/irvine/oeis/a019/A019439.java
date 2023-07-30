package irvine.oeis.a019;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A019439 Number of ways of tiling a 2 X n rectangle with dominoes and trominoes.
 * @author Georg Fischer
 */
public class A019439 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A019439() {
    super(0, "[0,-1,1,2,3,0,2,-1]", "1,1,2,6,17,43,108", 0);
  }
}

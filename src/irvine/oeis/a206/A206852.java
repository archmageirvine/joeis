package irvine.oeis.a206;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A206852 Numbers N such that N/2 is a square, N/3 is a cube, and N/5 is a fifth power.
 * a(n) = 30233088000000 * n^30
 * @author Georg Fischer
 */
public class A206852 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A206852() {
    super(1, 
    //  n^0   2   4   6   8  10  12  14  16  18  20  22  24  26  28  30
       "[[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30233088000000],[-1]]", 
       "[30233088000000]", 0);
  }
}

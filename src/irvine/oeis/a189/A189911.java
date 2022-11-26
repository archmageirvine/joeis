package irvine.oeis.a189;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A189911 Row sums of the extended Catalan triangle A189231.
 * @author Georg Fischer
 */
public class A189911 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A189911() {
    super(0, "[[0],[-8,12,0,-4],[4,6,-2],[-2,-3,0,1]]", "1,2,4", 0);
  }
}

package irvine.oeis.a349;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A349723 Atomic number corresponding to the element that is the first of the two middle elements in the n-th row of the periodic table of elements.
 * @author Georg Fischer
 */
public class A349723 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A349723() {
    super(1, "[0,-1,3,-2,-2,3,-1]", "1,6,14,27,45,70", 0);
  }
}

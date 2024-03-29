package irvine.oeis.a124;
// Generated by gen_seq4.pl holos at 2021-04-08 10:25
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A124806 Number of circular n-letter words over the alphabet {0,1,2,3,4} with adjacent letters differing by at most 2.
 * @author Georg Fischer
 */
public class A124806 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A124806() {
    super(0, "[0,-1,-1, 5, 3,-5, 1]", "[1, 5, 19, 65, 247, 955]", 0);
  }
}

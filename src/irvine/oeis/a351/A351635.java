package irvine.oeis.a351;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A351635 a(n) is the number of perfect matchings of an edge-labeled 2 X n Klein bottle grid graph, or equivalently the number of domino tilings of a 2 X n Klein bottle grid.  (The twist is on the length-n side.).
 * @author Georg Fischer
 */
public class A351635 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A351635() {
    super(1, "[0,1,0,-5,0,5,0,-1]", "2,6,10,16,38,54,142", 0);
  }
}

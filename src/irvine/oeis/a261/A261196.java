package irvine.oeis.a261;
// Generated by gen_seq4.pl holos at 2021-05-20 21:38
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A261196 Expansion of sqrt(8*x + sqrt(1 + 64*x^2)).
 * @author Georg Fischer
 */
public class A261196 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A261196() {
    super(0, "[[0],[240,-256, 64],[0],[0,-1, 1]]", "[1, 4]", 0);
  }
}

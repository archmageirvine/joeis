package irvine.oeis.a120;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (3-sqrt(1-4*x))/2
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A120588 G.f. is 1 + x*c(x), where c(x) is the g.f. of the Catalan numbers (A000108).
 * @author Georg Fischer
 */
public class A120588 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A120588() {
    super(0, "[[0],[0],[2,4],[-2,-1]]", "[1,1,1,2]", 2);
  }
}

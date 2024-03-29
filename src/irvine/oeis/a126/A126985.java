package irvine.oeis.a126;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 2/(10-8*sqrt(1-4*x))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A126985 Expansion of 1/(1+8*x*c(x)), c(x) the g.f. of Catalan numbers A000108.
 * @author Georg Fischer
 */
public class A126985 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126985() {
    super(0, "[[0],[128,256],[-110,-28],[-18,-9]]", "[1,-8,56,-400]", 2);
  }
}

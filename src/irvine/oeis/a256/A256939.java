package irvine.oeis.a256;
// Generated by gen_seq4.pl holos [[0],[-16,4],[36,-12],[-8,-4],[-8,20],[-6,-9],[2,1]] [1,3,13,57,257,1185] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A256939 Expansion of g.f.: (1-4*z-sqrt(1-8*z+12*z^2+8*z^3-4*z^4))/(2*z^2(1-z)).
 * @author Georg Fischer
 */
public class A256939 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A256939() {
    super(0, "[[0],[-16,4],[36,-12],[-8,-4],[-8,20],[-6,-9],[2,1]]", "[1,3,13,57,257,1185]", 0);
  }
}

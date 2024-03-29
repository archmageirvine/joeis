package irvine.oeis.a219;
// Generated by gen_seq4.pl holos [[0],[480,-1616,1392,-352],[240,-1130,1593,-649],[0,-32,-42,44]] [1,3,21] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A219535 G.f. satisfies A(x) = 1 + x*(2*A(x)^2 + A(x)^3).
 * @author Georg Fischer
 */
public class A219535 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A219535() {
    super(0, "[[0],[480,-1616,1392,-352],[240,-1130,1593,-649],[0,-32,-42,44]]", "[1,3,21]", 0);
  }
}

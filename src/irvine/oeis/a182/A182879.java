package irvine.oeis.a182;
// Generated by gen_seq4.pl holos at 2021-06-07 19:33
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A182879 The sum of the lengths of all weighted lattice paths in L_n.
 * radtorec(x*(-x^3+2*x^2+1)/((x^2-3*x+1)*(x^2+x+1))^(3/2))
 * @author Georg Fischer
 */
public class A182879 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A182879() {
    super(0, "[[0],[-5, 1],[17,-4],[-8, 3],[4,-1],[-24, 7],[10,-1],[-1, 2],[1,-1]]", "0, 1, 3, 11, 33, 96, 278, 787, 2205, 6133, 16941, 46554, 127390", 0);
  }
}

package irvine.oeis.a304;
// Generated by gen_seq4.pl holos at 2021-05-10 22:28
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A304126 a(n) = (6*n)!*(4*n)!/((2*n)!*(3*n)!*(5*n)!).
 * @author Georg Fischer
 */
public class A304126 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A304126() {
    super(0, "[[0],[1440,-20928, 109440,-257280, 276480,-110592],[0, 120,-1250, 4375,-6250, 3125]]", "[1, 12]", 0);
  }
}

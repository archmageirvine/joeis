package irvine.oeis.a138;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 1/(x*(1-4*x))-((1-x)/sqrt(1-4*x)-1)/x^2
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A138156 Sum of the path lengths of all binary trees with n edges.
 * @author Georg Fischer
 */
public class A138156 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A138156() {
    super(0, "[[0],[48,56,16],[-28,-34,-8],[4,5,1]]", "[0,2,14,74]", 2);
  }
}

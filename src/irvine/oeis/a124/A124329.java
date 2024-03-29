package irvine.oeis.a124;
// Generated by gen_seq4.pl holos at 2021-06-07 19:33
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A124329 Number of ordered trees with n edges, with thinning limbs and with root of degree 2. An ordered tree with thinning limbs is such that if a node has k children, all its children have at most k children.
 * radtorec(1/2*(1-x-2*x^2-(4*x^3-3*x^2-2*x+1)^(1/2))/(1-x)/x^2)
 * @author Georg Fischer
 */
public class A124329 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A124329() {
    super(1, "[[0],[-56, 30,-4],[120,-84, 15],[-72, 63,-15],[16, 0,-1],[-16,-9, 7],[8, 0,-2]]", "0, 1, 2, 5, 10, 22, 46, 101, 220, 492, 1104", 0);
  }
}

package irvine.oeis.a093;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 1+((1+x)*(1-2*x-x^3-sqrt((1-3*x+x^2)*(1-x)*(1-x^3))))/(2*x^4)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A093128 Number of dissections of a polygon using strictly disjoint diagonals.
 * @author Georg Fischer
 */
public class A093128 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A093128() {
    super(0, "[[0],[0,8,2],[-30,-29,-5],[30,23,2],[-150,-70,-7],[0,17,2],[-240,-71,-5],[120,32,2]]", "[1,1,3,6,13,29,65,148]", 6);
  }
}

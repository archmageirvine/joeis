package irvine.oeis.a188;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-2*x-x^3-(1-x)*sqrt((x^2-3*x+1)*(x^2+x+1)))/(2*x^5)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A188460 Diagonal sums of number triangle A119308.
 * @author Georg Fischer
 */
public class A188460 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A188460() {
    super(0, "[[0],[6,5,1],[-6,-5,-1],[-204,-82,-8],[318,95,7],[180,56,4],[630,169,11],[-330,-85,-5]]", "[1,2,4,9,20,45,103,238]", 6);
  }
}

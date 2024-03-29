package irvine.oeis.a257;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-4*x-sqrt((1-4*x)*(1-4*x-4*x^2)))/(2*x^2)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A257390 Number of 4-Motzkin paths of length n with no level steps at even level.
 * @author Georg Fischer
 */
public class A257390 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A257390() {
    super(0, "[[0],[64,192,128],[-240,-144],[-672,-600,-120],[928,516,68],[-328,-138,-14],[35,12,1]]", "[1,0,1,4,18,80,357]", 5);
  }
}

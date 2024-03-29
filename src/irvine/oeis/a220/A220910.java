package irvine.oeis.a220;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: ((1-12*x)^(3/2)+(1+36*x))/(2*(4*x+1)^2)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A220910 Matchings avoiding the pattern 231.
 * @author Georg Fischer
 */
public class A220910 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A220910() {
    super(0, "[[0],[24,48],[-18,8],[-2,-1]]", "[1,1,3,14]", 2);
  }
}

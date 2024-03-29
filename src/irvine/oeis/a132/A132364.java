package irvine.oeis.a132;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (2-x-x*sqrt(1-4*x))/(2-2*x+2*x^3)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A132364 Expansion of 1/(1-x^2*c(x)), c(x) the g.f. of A000108.
 * @author Georg Fischer
 */
public class A132364 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A132364() {
    super(0, "[[0],[12,14,4],[-246,-161,-25],[168,72,6],[228,164,28],[-426,-247,-35],[210,97,11],[-30,-11,-1]]", "[1,0,1,1,3,7,20,59]", 6);
  }
}

package irvine.oeis.a189;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: sqrt(1-4*x^2)/(16*x^4+sqrt(1-4*x^2)*(4*x^3-x)-8*x^2+1)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A189053 Expansion of d/dx log(1/(1-x/sqrt(1-4*x^2))).
 * @author Georg Fischer
 */
public class A189053 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A189053() {
    super(0, "[[0],[240,80],[0],[-228,-56],[0],[66,13],[0],[-6,-1]]", "[1,1,7,9,41,61,225,369]", 6);
  }
}

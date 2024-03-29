package irvine.oeis.a238;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-x-sqrt(x^2-6*x+1))/x
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A238111 Twice the large Schroeder numbers A006318.
 * @author Georg Fischer
 */
public class A238111 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A238111() {
    super(0, "[[0],[0,1,1],[-6,-11,-5],[-42,-29,-5],[12,7,1]]", "[2,4,12,44,180]", 3);
  }
}

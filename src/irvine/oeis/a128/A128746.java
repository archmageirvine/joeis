package irvine.oeis.a128;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (2*x*(1+x+sqrt(1-6*x+5*x^2)))/(1-3*x+sqrt(1-6*x+5*x^2))^2
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A128746 Height of the last peak summed over all skew Dyck paths of semilength n.
 * @author Georg Fischer
 */
public class A128746 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A128746() {
    super(1, "[[0],[0,10,5],[-20,-21,-6],[4,5,1]]", "[1,5,22,94]", 2);
  }
}

package irvine.oeis.a090;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-(1-4*x)^(1/2))/(2*(1-x-x^2))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A090826 Convolution of Catalan and Fibonacci numbers.
 * @author Georg Fischer
 */
public class A090826 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A090826() {
    super(0, "[[0],[6,4],[3,3],[-9,-5],[3,1]]", "[0,1,2,5,12]", 3);
  }
}

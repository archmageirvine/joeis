package irvine.oeis.a111;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (1/sqrt(1-x^2)*x)/(1-x)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A111601 Exponential (binomial) convolution of A001818 (with interspersed zeros) and A000142 (factorials).
 * @author Georg Fischer
 */
public class A111601 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A111601() {
    super(1, "[[0],[1,1],[1],[-1,-1]]", "[1,2,9,36]", 2);
    setGfType(1);
  }
}

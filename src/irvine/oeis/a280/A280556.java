package irvine.oeis.a280;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: 2*exp(x)-(2*(1-4*x))/(1-x)^4
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A280556 a(n) = Sum_{k=1..n} k^2 * (k+1)!.
 * @author Georg Fischer
 */
public class A280556 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A280556() {
    super(0, "[[0],[-12,-4],[-27,13,4],[78,51,3],[3,-17,-6],[-12,-7,-1]]", "[0,2,26,242,2162,20162]", 4);
    setGfType(1);
  }
}

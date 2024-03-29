package irvine.oeis.a256;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A256428 G.f.: x^2*(1-2*x)/(1-8*x+22*x^2-26*x^3+14*x^4-5*x^5+x^6).
 * @author Georg Fischer
 */
public class A256428 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A256428() {
    super(0, new long[] {0, 0, 1, -2},
      new long[] {1, -8, 22, -26, 14, -5, 1});
  }
}

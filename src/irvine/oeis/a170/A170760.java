package irvine.oeis.a170;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A170760 Expansion of g.f.: (1+x)/(1-40*x).
 * @author Georg Fischer
 */
public class A170760 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A170760() {
    super(0, new long[] {1, 1},
      new long[] {1, -40});
  }
}

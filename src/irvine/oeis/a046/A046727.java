package irvine.oeis.a046;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A046727 Related to Pythagorean triples: alternate terms of A001652 and A046090.
 * @author Georg Fischer
 */
public class A046727 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A046727() {
    super(0, new long[] {0, 3, 6, -1},
      new long[] {1, -5, -5, 1});
  }
}

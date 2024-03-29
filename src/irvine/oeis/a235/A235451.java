package irvine.oeis.a235;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A235451 Number of length n words on alphabet {0,1,2} of the form 0^(i)1^(j)2^(k) such that i=j or j=k.
 * @author Georg Fischer
 */
public class A235451 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A235451() {
    super(0, new long[] {1, 2, 3},
      new long[] {1, 0, -1, -1, 0, 1});
  }
}

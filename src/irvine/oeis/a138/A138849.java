package irvine.oeis.a138;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A138849 a(n) = AlexanderPolynomial[n] defined as Det[Transpose[S]-n S] where S is Kronecker Product of two 2 X 2 Seifert matrices {{-1, 1}, {0, -1}} [X] {{-1, 1}, {0, -1}} = {{1, -1, -1, 1}, {0, 1, 0, -1}, {0, 0, 1, -1}, {0, 0, 0, 1}}.
 * @author Georg Fischer
 */
public class A138849 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A138849() {
    super(1, new long[] {0, 1, -5, 17, 7, 4},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}

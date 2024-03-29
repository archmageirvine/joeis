package irvine.oeis.a271;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A271489 Maximal term of TRIP-Stern sequence of level n corresponding to permutation triple (e,132,e).
 * @author Georg Fischer
 */
public class A271489 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A271489() {
    super(0, new long[] {1, 2, 3, 2, 1, 1, 1, 1, 1, 0, 1, 0, 0, -1},
      new long[] {1, 0, 0, -2, 0, 0, -1, 0, 0, -1});
  }
}

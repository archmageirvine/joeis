package irvine.oeis.a059;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A059133 A hierarchical sequence (S(W2{2}c) - see A059126).
 * @author Georg Fischer
 */
public class A059133 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A059133() {
    super(0, new long[] {-4, -2},
      new long[] {-1, 4, -5, 2});
  }
}

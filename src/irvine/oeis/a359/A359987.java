package irvine.oeis.a359;
// Generated by gen_seq4.pl ogf/lingf at 2023-05-01 21:59

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A359987 Number of edge cuts in the n-ladder graph P_2 X P_n.
 * @author Georg Fischer
 */
public class A359987 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A359987() {
    super(1, "[0,1,-2,4]", "[1,-13,42,-16]");
  }
}

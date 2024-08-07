package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-07-31/lingf at 2024-07-31 22:55

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A374224 Integer part of the total Euclidean length of the shortest minimum-link polygonal chains joining all the nodes of the grid {0,1,...,n-1} X {0,1,...,n-1}.
 * @author Georg Fischer
 */
public class A374224 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A374224() {
    super(1, "[0, 0, 3, 3, -7, 1, 4, -3, 1]", "[1, -3, 3, -1]");
  }
}

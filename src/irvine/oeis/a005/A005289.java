package irvine.oeis.a005;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A005289 Number of graphs on n nodes with 3 cliques.
 * @author Sean A. Irvine
 */
public class A005289 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A005289() {
    super(new long[] {0, 0, 1, 1, 1, 3},
      new long[] {1, -3, 1, 4, -2, -2, -2, 4, 1, -3, 1});
  }
}

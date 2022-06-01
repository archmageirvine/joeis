package irvine.oeis.a005;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A005691 Number of Twopins positions.
 * @author Sean A. Irvine
 */
public class A005691 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A005691() {
    super(new long[] {1, 0, -1, 1, 0, 0, -2, -1, -1, -1, -1, -1},
      new long[] {1, -2, 0, 2, -1, 0, -2, 2, 0, 0, 0, 0, 1});
  }
}

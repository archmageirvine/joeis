package irvine.oeis.a055;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A055539 Number of asymmetric types of (4,n)-hypergraphs without isolated nodes, under action of symmetric group S_4; asymmetric n-covers of an unlabeled 4-set.
 * @author Sean A. Irvine
 */
public class A055539 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A055539() {
    super(3,
      new long[] {0, 0, 0, 3, 23, 33, 47, 57, 73, 150, 111, 115, 96, 35, 66, 40, -14, 53, -52, 42, 4, -21, 15, -49, 41, 3, -1, 8, -30, 14, 1, 5, -1, -7, 5, -1},
      new long[] {1, -7, 18, -17, -6, 23, -28, 59, -81, 32, 32, -76, 141, -163, 92, -15, -55, 164, -228, 164, -55, -15, 92, -163, 141, -76, 32, 32, -81, 59, -28, 23, -6, -17, 18, -7, 1});
  }
}

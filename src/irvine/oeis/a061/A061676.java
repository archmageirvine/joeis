package irvine.oeis.a061;
// manually partran at 2022-10-17 12:44

import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A061676 Triangle T(n,k) of number of ways of throwing k standard dice to produce a total of n.
 * @author Georg Fischer
 */
public class A061676 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A061676() {
    super(1, new PaddingSequence(new long[] {1, 1, 1, 1, 1, 1}, new long[] {0}));
  }
}

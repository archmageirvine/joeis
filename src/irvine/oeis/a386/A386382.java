package irvine.oeis.a386;

import irvine.oeis.a336.A336282;
import irvine.util.Permutation;

/**
 * A386382 Total number of runs in all heapable permutations of length n.
 * @author Sean A. Irvine
 */
public class A386382 extends A336282 {

  /** Construct the sequence. */
  public A386382() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    return Permutation.countRuns(p);
  }
}

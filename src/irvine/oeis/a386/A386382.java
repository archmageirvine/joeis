package irvine.oeis.a386;

import irvine.oeis.a388.A388139;
import irvine.util.Permutation;

/**
 * A336282 Number of heapable permutations of length n.
 * @author Sean A. Irvine
 */
public class A386382 extends A388139 {

  /** Construct the sequence. */
  public A386382() {
    super(1);
  }

  @Override
  protected long contribution(final int[] p) {
    return Permutation.countRuns(p);
  }
}

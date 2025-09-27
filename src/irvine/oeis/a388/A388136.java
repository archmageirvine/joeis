package irvine.oeis.a388;

import irvine.util.Permutation;

/**
 * A336282 Number of heapable permutations of length n.
 * @author Sean A. Irvine
 */
public class A388136 extends A388139 {

  /** Construct the sequence. */
  public A388136() {
    super(1);
  }

  @Override
  protected long contribution(final int[] p) {
    return Permutation.countCycles(p);
  }
}

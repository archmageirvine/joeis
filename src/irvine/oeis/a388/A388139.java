package irvine.oeis.a388;

import irvine.oeis.a336.A336282;
import irvine.util.Permutation;

/**
 * A388139 Total number of fixed points in all heapable permutations of length n.
 * @author Sean A. Irvine
 */
public class A388139 extends A336282 {

  /** Construct the sequence. */
  public A388139() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    return Permutation.fixedPoints(p);
  }
}

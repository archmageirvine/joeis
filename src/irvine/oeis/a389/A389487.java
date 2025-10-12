package irvine.oeis.a389;

import irvine.util.Permutation;

/**
 * A389487 allocated for Manolopoulos Panagiotis.
 * @author Sean A. Irvine
 */
public class A389487 extends A389255 {

  @Override
  protected int contribution(final int[] p) {
    return Permutation.countIncreasingRuns(p);
  }
}

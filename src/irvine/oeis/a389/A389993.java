package irvine.oeis.a389;

import irvine.util.Permutation;

/**
 * A389993 allocated for Manolopoulos Panagiotis.
 * @author Sean A. Irvine
 */
public class A389993 extends A389255 {

  @Override
  protected int contribution(final int[] p) {
    return Permutation.countPairs(p) + 1;
  }
}

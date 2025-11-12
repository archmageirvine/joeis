package irvine.oeis.a390;

import irvine.oeis.a389.A389255;

/**
 * A390377 allocated for Manolopoulos Panagiotis.
 * @author Sean A. Irvine
 */
public class A390377 extends A389255 {

  @Override
  protected int contribution(final int[] p) {
    for (int k = 0; k < p.length; ++k) {
      if (p[k] == 1) {
        return k + 1;
      }
    }
    return 0;
  }
}

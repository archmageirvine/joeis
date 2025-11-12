package irvine.oeis.a390;

import irvine.oeis.a336.A336282;

/**
 * A390377 allocated for Manolopoulos Panagiotis.
 * @author Sean A. Irvine
 */
public class A390450 extends A336282 {

  /** Construct the sequence. */
  public A390450() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    for (int k = 0; k < p.length; ++k) {
      if (p[k] == 1) {
        return k;
      }
    }
    return 0;
  }
}

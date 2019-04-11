package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001182 Number of cells of square lattice of edge <code>1/n</code> inside quadrant of unit circle centered at 0.
 * @author Sean A. Irvine
 */
public class A001182 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long ns = mN * mN;
    Z s = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      s = s.add(LongUtils.sqrt(ns - k * k));
    }
    return s;
  }
}

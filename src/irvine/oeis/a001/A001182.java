package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001182 Number of cells of square lattice of edge 1/n inside quadrant of unit circle centered at 0.
 * @author Sean A. Irvine
 */
public class A001182 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long ns = mN * mN;
    Z s = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      s = s.add(Functions.SQRT.l(ns - k * k));
    }
    return s;
  }
}

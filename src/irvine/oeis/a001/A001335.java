package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001335 Number of n-step polygons on hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A001335 extends A001334 {

  @Override
  protected long count(final int point) {
    if (mN > 1) {
      for (final int delta : DELTAS) {
        if (point == ORIGIN + delta) {
          return 6;
        }
      }
    }
    return 0;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    setPathLength(mN);
    setPathElement(0, ORIGIN);
    return Z.valueOf(count(ORIGIN + D1, 1));
  }
}

package irvine.oeis.a007;

import irvine.oeis.a001.A001334;

/**
 * A007200 Number of self-avoiding walks on hexagonal lattice, with additional constraints.
 * @author Sean A. Irvine
 */
public class A007200 extends A001334 {

  private final int mM;

  protected A007200(final int m) {
    mM = m;
    for (int k = 0; k < m; ++k) {
      super.next();
    }
  }

  /** Construct the sequence. */
  public A007200() {
    this(2);
  }

  private boolean isAdjacent(final int u, final int v) {
    final int dx = Math.abs(x(u) - x(v));
    final int dy = Math.abs(y(u) - y(v));
    return (dx == 1 && dy == 1) || (dy == 0 && dx == 2);
  }

  @Override
  protected long count(final int point) {
    if (mN < mM) {
      return 0;
    }
    final int hi = getPathElement((mN + mM) / 2);
    final int lo = getPathElement((mN - mM) / 2);
    if (isAdjacent(lo, hi)) {
      return 6;
    }
    if (((mN ^ mM) & 1) == 1) {
      if (isAdjacent(lo, getPathElement((mN + mM - 1) / 2))) {
        return 6;
      }
    }
    return 0;
  }
}

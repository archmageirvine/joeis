package irvine.oeis.a004;

import java.util.HashSet;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;

/**
 * A004481 Table of Sprague-Grundy values for Wythoff's game (Wyt Queens) read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A004481 extends A004489 {

  private class WytQueens extends MemoryFunction2<Z, Z> {

    @Override
    protected Z compute(final Z a, final Z b) {
      if (a.compareTo(Z.THREE) < 0 || b.compareTo(Z.THREE) < 0) {
        return tersum(a, b);
      }
      // mex (minimum excluded integer)
      final HashSet<Z> seen = new HashSet<>();
      for (Z k = Z.ZERO; k.compareTo(b) < 0; k = k.add(1)) {
        seen.add(wytQueens(a, k));
      }
      for (Z k = Z.ZERO; k.compareTo(a) < 0; k = k.add(1)) {
        seen.add(wytQueens(k, b));
      }
      final Z m = b.min(a);
      for (Z k = Z.ONE; k.compareTo(m) <= 0; k = k.add(1)) {
        seen.add(wytQueens(a.subtract(k), b.subtract(k)));
      }
      for (Z k = Z.ZERO; ; k = k.add(1)) {
        if (!seen.contains(k)) {
          return k;
        }
      }
    }
  }

  private final WytQueens mWytQueens = new WytQueens();

  protected Z wytQueens(final Z a, final Z b) {
    // Use symmetry to reduced size of remembered table
    return a.compareTo(b) <= 0 ? mWytQueens.get(a, b) : mWytQueens.get(b, a);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return wytQueens(Z.valueOf(mM), Z.valueOf(mN - mM));
  }
}


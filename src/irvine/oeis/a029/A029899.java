package irvine.oeis.a029;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029899 Number of strategic configurations in 3 X n Chomp rectangle.
 * @author Sean A. Irvine
 */
public class A029899 implements Sequence {

  private static final int BITS_PER_VALUE = 21;
  protected final TreeSet<Long> mPPositions = new TreeSet<>();
  private int mN = -1;

  protected long pack(final int p, final int q, final int r) {
    return (((long) p) << (2 * BITS_PER_VALUE)) + (((long) q) << BITS_PER_VALUE) + r;
  }

  private boolean isP(final int p, final int q, final int r) {
    // A position is a P position, if no chomp of it is a P position
    //System.out.println("Testing (" + p + "," + q + "," + r + ")");
    // Chomp somewhere on bottom row
    for (int k = r; k >= 0; --k) {
      if (mPPositions.contains(pack(p, q, k))) {
        return false;
      }
    }
    // Chomp somewhere on middle row
    for (int k = q; k >= 0; --k) {
      if (mPPositions.contains(pack(p, k, Math.min(r, k)))) {
        return false;
      }
    }
    // Chomp somewhere on top row
    for (int k = p; k >= 1; --k) {
      if (mPPositions.contains(pack(k, Math.min(q, k), Math.min(r, k)))) {
        return false;
      }
    }
    //System.out.println("(" + p + "," + q + "," + r + ") is a P-position");
    return true;
  }

  @Override
  public Z next() {
    if (++mN >= 1L << BITS_PER_VALUE) {
      throw new UnsupportedOperationException();
    }
    if (mN > 0) {
      for (int q = 0; q <= mN; ++q) {
        for (int r = 0; r <= q; ++r) {
          if (isP(mN, q, r)) {
            mPPositions.add(pack(mN, q, r));
          }
        }
      }
    }
    return Z.valueOf(mPPositions.size());
  }
}

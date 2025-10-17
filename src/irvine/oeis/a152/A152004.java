package irvine.oeis.a152;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A152004 This is a sequence from 4 X n Chomp. Values of p for which there is a P-position (p,p,r,r).
 * @author Sean A. Irvine
 */
public class A152004 extends Sequence0 {

  private static final int BITS_PER_VALUE = 16;
  protected final TreeSet<Long> mPPositions = new TreeSet<>();
  private int mN = -1;

  protected long pack(final int p, final int q, final int r, final int s) {
    return (((long) p) << (3 * BITS_PER_VALUE)) + (((long) q) << (2 * BITS_PER_VALUE)) + (((long) r) << BITS_PER_VALUE) + s;
  }

  private boolean isP(final int p, final int q, final int r, final int s) {
    // A position is a P position, if no chomp of it is a P position
    // Chomp somewhere on bottom row
    for (int k = s; k >= 0; --k) {
      if (mPPositions.contains(pack(p, q, r, k))) {
        return false;
      }
    }
    // Chomp somewhere on 3rd row
    for (int k = r; k >= 0; --k) {
      if (mPPositions.contains(pack(p, q, k, Math.min(s, k)))) {
        return false;
      }
    }
    // Chomp somewhere on 2nd row
    for (int k = q; k >= 0; --k) {
      if (mPPositions.contains(pack(p, k, Math.min(r, k), Math.min(s, k)))) {
        return false;
      }
    }
    // Chomp somewhere on top row
    for (int k = p; k >= 1; --k) {
      if (mPPositions.contains(pack(k, Math.min(q, k), Math.min(r, k), Math.min(s, k)))) {
        return false;
      }
    }
    return true;
  }

  protected Z select(final long p, final long r) {
    return Z.valueOf(p);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN >= 1L << BITS_PER_VALUE) {
        throw new UnsupportedOperationException();
      }
      if (mN > 0) {
        long solvedR = -1;
        for (int q = 0; q <= mN; ++q) {
          for (int r = 0; r <= q; ++r) {
            for (int s = 0; s <= r; ++s) {
              if (isP(mN, q, r, s)) {
                mPPositions.add(pack(mN, q, r, s));
                if (mN == q && r == s) {
                  solvedR = r;
                }
              }
            }
          }
        }
        if (solvedR > 0) {
          return select(mN, solvedR);
        }
      }
    }
  }
}

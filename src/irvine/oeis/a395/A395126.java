package irvine.oeis.a395;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029899.
 * @author Sean A. Irvine
 */
public class A395126 extends Sequence0 {

  private static final int BITS_PER_VALUE = Long.SIZE / 4;
  protected final TreeSet<Long> mPPositions = new TreeSet<>();
  private int mN = 0;

  protected long pack(final int p, final int q, final int r, final int s) {
    return (((long) p) << (3 * BITS_PER_VALUE)) + (((long) q) << (2 * BITS_PER_VALUE)) + (((long) r) << BITS_PER_VALUE) + s;
  }

  private boolean isP(final int p, final int q, final int r, final int s) {
    // A position is a P position, if no chomp of it is a P position
    //System.out.println("Testing (" + p + "," + q + "," + r + "," + s + ")");
    // Chomp somewhere on bottom row
    for (int k = s; k >= 0; --k) {
      if (mPPositions.contains(pack(p, q, r, k))) {
        return false;
      }
    }
    // Chomp somewhere on third row
    for (int k = r; k >= 0; --k) {
      if (mPPositions.contains(pack(p, q, k, Math.min(s, k)))) {
        return false;
      }
    }
    // Chomp somewhere on second row
    for (int k = q; k >= 0; --k) {
      if (mPPositions.contains(pack(p, k, Math.min(r, k), Math.min(s, k)))) {
        return false;
      }
    }
    // Chomp somewhere on bottom row
    for (int k = p; k >= 1; --k) {
      if (mPPositions.contains(pack(k, Math.min(q, k), Math.min(r, k), Math.min(s, k)))) {
        return false;
      }
    }
    //System.out.println("(" + p + "," + q + "," + r + "," + s + ") is a P-position");
    return true;
  }

  private int mQ = 0;
  private int mR = 0;
  private int mS = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mS > mR) {
        mS = 0;
        if (++mR > mQ) {
          mR = 0;
          if (++mQ > mN) {
            mQ = 0;
            if (++mN >= 1L << BITS_PER_VALUE) {
              throw new UnsupportedOperationException();
            }
          }
        }
      }
      if (isP(mN, mQ, mR, mS)) {
        mPPositions.add(pack(mN, mQ, mR, mS));
        return Z.valueOf(mS);
      }
    }
  }
}

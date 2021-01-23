package irvine.oeis.a234;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A234013 Number of maximally biased free polyominoes with n squares.
 * @author Sean A. Irvine
 */
public class A234013 implements Sequence {

  private long[] mBiasCounts = null;
  private final Hunter mHunter = new Hunter(Lattices.Z2, true) {
    {
      setKeeper((animal, forbidden) -> {
        if (Canons.Z2_FREE.isCanonical(animal)) {
          int white = 0;
          for (final long p : animal.points()) {
            final long x = Lattices.Z2.ordinate(p, 0);
            final long y = Lattices.Z2.ordinate(p, 1);
            white += (x ^ y) & 1;
          }
          ++mBiasCounts[Math.max(white, animal.size() - white)];
        }
      });
    }
  };
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    mBiasCounts = new long[mN + 1];
    mHunter.count(mN);
    int k = mN - 1;
    while (k > 0 && mBiasCounts[k] == 0) {
      --k;
    }
    return Z.valueOf(mBiasCounts[k]);
  }
}

package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086328 Number of n X n circulant singular (0,1) matrices over the reals.
 * @author Sean A. Irvine
 */
public class A086328 extends Sequence1 {

  // Cf. A144926.

  private static final double EPS = 1.0E-12;

  private int mN = 0;
  private int mNsig;
  private long mPmMax;
  private long mPmInt;
  private double[][] mRept;
  private double[][] mImpt;

  /**
   * Circular right shift of an n-bit word.
   * @param x word
   * @return circularly shifted word
   */
  private long rotate(final long x) {
    return ((x >>> 1) | (x << (mN - 1))) & mPmMax;
  }

  /**
   * Reject noncanonical rotations and reversals and, for a canonical
   * representative, test whether the corresponding circulant is singular.
   * @return contribution to the count
   */
  private long isomDet() {
    long pmrot = mPmInt;
    int syms = 0;

    // Reject unless canonical under cyclic rotations.
    for (int j = 0; j < mN && pmrot >= mPmInt; ++j) {
      if (pmrot == mPmInt) {
        ++syms;
      }
      pmrot = rotate(pmrot);
    }
    if (pmrot < mPmInt) {
      return 0;
    }

    // Form the reversal.  At this point pmrot == mPmInt, since a complete
    // cycle has been made.
    long pmrev = 0;
    for (int j = 0; j < mN; ++j) {
      pmrev = (pmrev << 1) | (pmrot & 1);
      pmrot >>>= 1;
    }

    // Reject unless also canonical under reversal followed by rotation.
    for (int j = 0; j < mN && pmrev >= mPmInt; ++j) {
      if (pmrev == mPmInt) {
        ++syms;
      }
      pmrev = rotate(pmrev);
    }
    if (pmrev < mPmInt) {
      return 0;
    }

    // Test the linear factors associated with the divisors of n.
    for (int i = 0; i < mNsig; ++i) {
      double facr = 0;
      double faci = 0;
      pmrot = mPmInt;

      for (int j = 0; j < mN; ++j) {
        if ((pmrot & 1) != 0) {
          facr += mRept[i][j];
          faci += mImpt[i][j];
        }
        pmrot >>>= 1;
      }

      if (Math.abs(facr) < EPS && Math.abs(faci) < EPS) {
        return 2L * mN / syms;
      }
    }

    return 0;
  }

  /**
   * Count singular circulants of order n.
   * @return count
   */
  private long circCount() {
    if (mN == 0) {
      return 1;
    }
    mRept = new double[mN][mN];
    mImpt = new double[mN][mN];
    int k = 0;
    final double twoPiOverN = 2.0 * Math.PI / mN;
    for (int i = 0; i < mN; ++i) {
      if (i == 0 || mN % i == 0) {
        for (int j = 0; j < mN; ++j) {
          final double theta = i * j * twoPiOverN;
          mRept[k][j] = Math.cos(theta);
          mImpt[k][j] = Math.sin(theta);
        }
        ++k;
      }
    }
    mNsig = k;
    mPmMax = (1L << mN) - 1;

    // The all-zero circulant is singular
    mPmInt = 0;
    long count = isomDet();
    /*
     * Every nonzero binary word has a cyclic rotation ending in a 1-bit,
     * hence only odd words need be examined.  Noncanonical rotations and
     * reversals are rejected by isomDet().
     */
    for (mPmInt = 1; mPmInt <= mPmMax; mPmInt += 2) {
      count += isomDet();
    }
    return count;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(circCount());
  }
}

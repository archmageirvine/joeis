package irvine.oeis.a144;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A144926 Number of n X n (-1,1)-circulant matrices with determinant 0.
 * @author Sean A. Irvine
 */
public class A144926 extends Sequence0 {

  // After Fred Lunnon: https://oeis.org/A144926/a144926.txt

  private int mN = -1;
  private int mNsig;
  private long mPmMax;
  private long mPmInt;

  private double[][] mRept;
  private double[][] mImpt;
  private static final double EPS = 1.0E-12;

  /**
   * Circular right shift of an n-bit word.
   * @param x word
   * @return circularly shifted word
   */
  private long rotate(final long x) {
    return ((x >>> 1) ^ (x << (mN - 1))) & mPmMax;
  }

  /**
   * Reject noncanonical isomorphs and, for canonical representatives,
   * test whether the corresponding circulant is singular.
   * @return contribution to the count
   */
  private long isomDet() {
    long pmrot = mPmInt;
    int syms = 0;

    // Cyclic shifts
    for (int j = 0; j < mN && pmrot >= mPmInt; ++j) {
      if (pmrot == mPmInt) {
        ++syms;
      }
      pmrot = rotate(pmrot);
    }
    if (pmrot < mPmInt) {
      return 0;
    }

    // Complement and its cyclic shifts
    long pmcom = (~mPmInt) & mPmMax;
    for (int j = 0; j < mN && pmcom >= mPmInt; ++j) {
      if (pmcom == mPmInt) {
        ++syms;
      }
      pmcom = rotate(pmcom);
    }
    if (pmcom < mPmInt) {
      return 0;
    }

    // Reverse, at this point pmrot == mPmInt again after the first cycle
    long pmrev = 0;
    for (int j = 0; j < mN; ++j) {
      pmrev = (pmrev << 1) | (pmrot & 1);
      pmrot >>>= 1;
    }

    // Reverse and its cyclic shifts.
    for (int j = 0; j < mN && pmrev >= mPmInt; ++j) {
      if (pmrev == mPmInt) {
        ++syms;
      }
      pmrev = rotate(pmrev);
    }
    if (pmrev < mPmInt) {
      return 0;
    }

    // Complement of reverse and its cyclic shifts.
    pmcom = (~pmrev) & mPmMax;
    for (int j = 0; j < mN && pmcom >= mPmInt; ++j) {
      if (pmcom == mPmInt) {
        ++syms;
      }
      pmcom = rotate(pmcom);
    }
    if (pmcom < mPmInt) {
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
        } else {
          facr -= mRept[i][j];
          faci -= mImpt[i][j];
        }
        pmrot >>>= 1;
      }

      if (Math.abs(facr) < EPS && Math.abs(faci) < EPS) {
        return 4L * mN / syms;
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
      return 0;
    }

    // There is one factor class for each divisor of n.
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

    long count = 0;
    // Special case: 00...0
    mPmInt = 0;
    count += isomDet();
    // Special case: 0101...01
    for (int j = 0; j < mN / 2; ++j) {
      mPmInt = (mPmInt << 2) | 1;
    }
    count += isomDet();
    // Main loop
    long pmfin = (7L << (mN - 5)) - 3;
    if (mN < 5) {
      pmfin = (mPmMax >>> 2) - 2;
    }
    mPmInt = -1;
    while (mPmInt <= pmfin) {
      mPmInt += 2;
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

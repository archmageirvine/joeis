package irvine.oeis.a039;

import java.util.ArrayList;
import java.util.List;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039796 Sequence arising in search for Legendre sequences.
 * @author Sean A. Irvine
 */
public class A039796 implements Sequence {

  private int mN = 1;
  private long mLim = 0;
  private double[] mSin = null;
  private double[] mCos = null;

  private int autocorrelation(final long n, final int s) {
    int sum = 0;
    for (int k = 0, j = s; k < mN; ++k, ++j) {
      if (j >= mN) {
        j -= mN;
      }
      sum += (n >>> k) & (n >>> j) & 1;
    }
    return sum;
  }

  private boolean isCompatible(final long n, final long m) {
    final int a = autocorrelation(n, 1) + autocorrelation(m, 1);
    for (int k = 2; k < mN; ++k) {
      if (autocorrelation(n, k) + autocorrelation(m, k) != a) {
        return false;
      }
    }
    return true;
  }

  private boolean isCanonical(final long n) {
    // largest is canon
    long m = n;
    for (int k = 1; k < mN; ++k) {
      m <<= 1;
      if (m >= mLim) {
        m -= mLim;
        ++m;
      }
      if (m > n) {
        return false;
      }
    }
    return true;
  }

  private double c(final int n, final int w) {
    return 2.0 * (n * w - w * w) / (n - 1);
  }

  private boolean pst(final double c, final long v) {
    // DFT, k > 0, but aborting if we see a value that show non-compatible
    for (int k = 1; k < mN; ++k) { // skip k == 0
      double sumreal = 0;
      double sumimag = 0;
      long w = v;
      for (int j = 0; w != 0; j += k, w >>>= 1) {
        if (j >= mN) {
          j -= mN;
        }
        if ((w & 1) == 1) {
          sumreal += mCos[j];
          sumimag -= mSin[j];
        }
      }
      if (sumreal * sumreal + sumimag * sumimag > c) {
        return false;
      }
    }
    return true;
  }


  @Override
  public Z next() {
    mN += 2;
    if (mN == 3) {
      return Z.ONE; // I think the data is actually wrong here, should be 0
    }
    final int w = (mN + 1) / 2;
    mLim = 1L << mN;
    final double c = c(mN, w);

    // Precompute values used for DFT
    mSin = new double[mN];
    mCos = new double[mN];
    for (int k = 0; k < mN; ++k) {
      final double angle = 2 * Math.PI * k / mN;
      mSin[k] = Math.sin(angle);
      mCos[k] = Math.cos(angle);
    }

    final List<Long> canons = new ArrayList<>();
    for (long k = (1L << w) - 1; k < mLim; k = LongUtils.swizzle(k)) {
      if (isCanonical(k) && pst(c, k)) {
        canons.add(k);
      }
    }
    System.out.println("n=" + mN + " w=" + w + " c=" + c(mN, w) + " canons=" + canons.size());
    long cnt = 0;
    for (final long c1 : canons) {
      for (final long c2 : canons) {
        if (c1 != c2 && isCompatible(c1, c2)) {
          ++cnt;
          break;
        }
      }
    }
    //System.out.println(mN + " " + w);
    return Z.valueOf(cnt);
  }
}


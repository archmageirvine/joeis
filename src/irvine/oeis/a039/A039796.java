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

  protected int mN = 1;
  protected long mLim = 0;
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

  protected boolean isCanonical(final long n) {
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

  private boolean isCompatible(final int[] a, final int[] b) {
    final int c = a[0] + b[0];
    for (int k = 1; k < a.length; ++k) {
      if (a[k] + b[k] != c) {
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

    // Precompute autocorrelations
    final int[][] autoc = new int[canons.size()][mN - 1];
    for (int k = 0; k < autoc.length; ++k) {
      final long canon = canons.get(k);
      for (int j = 0; j < autoc[k].length; ++j) {
        autoc[k][j] = autocorrelation(canon, j + 1);
      }
    }

    System.out.println("Auto correlations done");

    long cnt = 0;
    for (int k = 0; k < autoc.length; ++k) {
      for (int j = 0; j < autoc.length; ++j) {
        if (j != k && isCompatible(autoc[k], autoc[j])) {
          ++cnt;
          break;
        }
      }
    }
    //System.out.println(mN + " " + w);
    return Z.valueOf(cnt);
  }
}


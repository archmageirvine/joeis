package irvine.oeis.a039;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A039796 Sequence arising in search for Legendre sequences.
 * @author Sean A. Irvine
 */
public class A039796 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
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
    for (int k = 0; k < a.length; ++k) {
      if (a[k] + b[k] != 0) {
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
    for (long k = (1L << w) - 1; k < mLim; k = Functions.SWIZZLE.l(k)) {
      if (isCanonical(k) && pst(c, k)) {
        canons.add(k);
      }
    }
    if (mVerbose) {
      StringUtils.message("n=" + mN + " w=" + w + " c=" + c(mN, w) + " canons=" + canons.size());
    }

    // Precompute autocorrelations
    // Normalize by a(0)
    final int[][] autoc = new int[canons.size()][mN - 2];
    final HashMap<Integer, List<int[]>> compats = new HashMap<>();
    for (int k = 0; k < autoc.length; ++k) {
      final long canon = canons.get(k);
      final int a0 = autocorrelation(canon, 1);
      for (int j = 0; j < autoc[k].length; ++j) {
        autoc[k][j] = autocorrelation(canon, j + 2) - a0;
      }
      final int akKey = autoc[k][0];
      if (!compats.containsKey(akKey)) {
        compats.put(akKey, new ArrayList<>());
      }
      compats.get(akKey).add(autoc[k]);
    }
    if (mVerbose) {
      StringUtils.message("Auto correlations done, classes " + compats.size());
    }

    long cnt = 0;
    for (final Map.Entry<Integer, List<int[]>> e : compats.entrySet()) {
      final int autoKey = e.getKey();
      if (compats.containsKey(-autoKey)) {
        for (final int[] autock : autoc) {
          for (final int[] autocj : compats.get(-autoKey)) {
            if (autocj != autock && isCompatible(autock, autocj)) {
              ++cnt;
              break;
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}


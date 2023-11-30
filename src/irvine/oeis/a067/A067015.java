package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066865.
 * @author Sean A. Irvine
 */
public class A067015 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private int mMax = 0;
  private Z[] mSum = new Z[0];

  private Z[][] createEmpty(final int n, final int m) {
    final Z[][] res = new Z[n][m];
    for (final Z[] row : res) {
      Arrays.fill(row, Z.ZERO);
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mM > mMax) {
      if (++mN > 64) {
        throw new UnsupportedOperationException();
      }
      final ArrayList<Long> patterns = new ArrayList<>();
      for (long i = 0; i < (1L << mN); ++i) {
        if ((i & 1) == 0 || (i & (1L << (mN - 1))) == 0) {
          long j = i;
          while (j != 0 && (j & 3) != 3) {
            j /= 2;
          }
          if ((j & 3) != 3) {
            patterns.add(i);
          }
        }
      }
      final long[] p = new long[patterns.size()];
      for (int k = 0; k < p.length; ++k) {
        p[k] = patterns.get(k);
      }
      // Precompute left rotations
      final long[] left = new long[p.length];
      for (int k = 0; k < p.length; ++k) {
        left[k] = (p[k] << 1) + (p[k] >>> (mN - 1));
      }
      // Precompute right rotations
      final long[] right = new long[p.length];
      for (int k = 0; k < p.length; ++k) {
        right[k] = (p[k] >>> 1) + ((p[k] & 1) << (mN - 1));
      }
      final int len = p.length;
      mSum = new Z[(mN * mN + 1) / 2];
      Arrays.fill(mSum, Z.ZERO);
      for (int pos = 0; pos < len; ++pos) {
        Z[][] v = createEmpty(len, mN / 2 + 1);
        v[pos][Long.bitCount(p[pos])] = Z.ONE;
        for (int i = 1; i < mN; ++i) {
          final Z[][] w = createEmpty(len, (i + 1) * mN / 2 + 1);
          for (int k = 0; k < len; ++k) {
            final long pk = p[k];
            final int princes = Long.bitCount(pk);
            for (int j = 0; j < len; ++j) {
              if ((i & 1) == 1) {
                if ((p[j] & pk) == 0 && (left[j] & pk) == 0) {
                  for (int u = 0; u < v[j].length; ++u) {
                    w[k][u + princes] = w[k][u + princes].add(v[j][u]);
                  }
                }
              } else {
                if ((p[j] & pk) == 0 && (right[j] & pk) == 0) {
                  for (int u = 0; u < v[j].length; ++u) {
                    w[k][u + princes] = w[k][u + princes].add(v[j][u]);
                  }
                }
              }
            }
          }
          v = w;
        }
        final long l = left[pos];
        if ((mN & 1) == 0) {
          for (int k = 0; k < len; ++k) {
            if ((p[k] & p[pos]) == 0 && (p[k] & l) == 0) {
              for (int u = 0; u < mSum.length; ++u) {
                mSum[u] = mSum[u].add(v[k][u]);
              }
            }
          }
        } else {
          final long r = right[pos];
          for (int k = 0; k < len; ++k) {
            if ((p[k] & r) == 0 && (p[k] & l) == 0) {
              for (int u = 0; u < mSum.length; ++u) {
                mSum[u] = mSum[u].add(v[k][u]);
              }
            }
          }
        }
      }
      mMax = mSum.length - 1;
      while (mSum[mMax].isZero()) {
        --mMax;
      }
      mM = 0;
    }
    return mSum[mM];
  }
}

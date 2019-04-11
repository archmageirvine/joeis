package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.Collection;

import irvine.math.PopCount;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003003 Size of the largest subset of the numbers <code>[1...n]</code> which doesn't contain a 4-term arithmetic progression.
 * @author Sean A. Irvine
 */
public class A003003 implements Sequence {

  private int mN = 0;
  private int mMax = 0;
  private Collection<Long> mProgressions = null;

  private static Collection<Long> progressions(final int n, final int m) {
    if (n > 64) {
      throw new UnsupportedOperationException();
    }
    // Construct syndromes of all n element arithmetic progressions of m elements
    final ArrayList<Long> res = new ArrayList<>();
    final long q = m - 1;
    for (int firstElement = 1; firstElement <= n - q; ++firstElement) {
      final long a = 1L << (firstElement - 1);
      for (int d = 1; d <= (n - firstElement + q) / q; ++d) {
        long v = a;
        boolean ok = true;
        for (int j = 1; j < m; ++j) {
          final int bit = firstElement - 1 + d * j;
          if (bit > 63) {
            ok = false;
            break;
          }
          v |= 1L << bit;
        }
        if (ok) {
          assert PopCount.popcount(v) == m;
          res.add(v);
        }
      }
    }
    return res;
  }

  private void search(final long included, final int count, final int lastIndex) {
    if (count > mMax) {
      mMax = count;
    }
    if (mN - lastIndex <= mMax - count) {
      return; // will never find a better solution
    }
    for (int p = lastIndex + 1; p <= mN; ++p) {
      final long v = included + (1L << (p - 1));
      boolean ok = true;
      for (final long t : mProgressions) {
        if ((v & t) == t) {
          ok = false;
          break;
        }
      }
      if (ok) {
        // Recursively search
        search(v, count + 1, p);
      }
    }
  }

  protected int getProgressionLength() {
    return 4;
  }

  @Override
  public Z next() {
    ++mN;
    mMax = 0;
    mProgressions = progressions(mN, getProgressionLength());
    search(0, 0, 0);
    return Z.valueOf(mMax);
  }
}


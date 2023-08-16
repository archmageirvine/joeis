package irvine.oeis.a364;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A364237 allocated for Anna Coleman.
 * @author Sean A. Irvine
 */
public class A364237 extends Sequence1 {

  private long mCount = 0;
  private int mN = -1;
  private int mMod = 0;

  private boolean isMinimal(final int[] perm) {
    // Check multiplication by coprime with reversal
    for (int k = 1; k <= perm.length; ++k) {
      if (IntegerUtils.gcd(k, mMod) == 1) {
        for (int j = 0; j < perm.length; ++j) {
          final int c = Integer.compare(perm[j], (perm[perm.length - 1 - j] * k) % mMod);
          if (c < 0) {
            break;
          } else if (c > 0) {
            return false;
          }
        }
      }
    }
    // Check multiplication by coprime
    for (int k = 2; k <= perm.length; ++k) {
      if (IntegerUtils.gcd(k, mMod) == 1) {
        for (final int i : perm) {
          final int c = Integer.compare(i, (i * k) % mMod);
          if (c < 0) {
            break;
          } else if (c > 0) {
            return false;
          }
        }
      }
    }
    return true;
  }

  private boolean isSumOk(final int[] sums, final int pos, final int v) {
    for (int k = 0; k < pos; ++k) {
      if ((sums[k] + v) % mMod == 0) {
        return false;
      }
    }
    return true;
  }

  private boolean isMinimalElement(final int k) {
    for (int j = 2; j < mMod; ++j) {
      if (IntegerUtils.gcd(j, mMod) == 1 && (k * j) % mMod < k) {
        return false;
      }
    }
    return true;
  }

  private void search(final int[] perm, final int[] sums, final int pos, final long used) {
    if (pos == perm.length) {
      if (isMinimal(perm)) {
        ++mCount;
      }
      return;
    }
    for (int k = 1; k <= perm.length; ++k) {
      if ((pos > 0 || isMinimalElement(k)) && (used & 1L << (k - 1)) == 0 && isSumOk(sums, pos, k)) {
        perm[pos] = k;
        for (int j = 0; j <= pos; ++j) {
          sums[j] += k;
        }
        search(perm, sums, pos + 1, used | (1L << (k - 1)));
        for (int j = 0; j <= pos; ++j) {
          sums[j] -= k;
        }
      }
    }
  }

  @Override
  public Z next() {
    mCount = 0;
    mN += 2;
    mMod += 2;
    if (mN > 64) {
      throw new UnsupportedOperationException();
    }
    final int[] perm = new int[mN];
    final int[] sums = new int[mN];
    search(perm, sums, 0, 0);
    return Z.valueOf(mCount);
  }
}

package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;

import java.util.Arrays;

/**
 * A002842 Number of strongly asymmetric sequences of length <code>n</code>.
 * @author Sean A. Irvine
 */
public class A002842 implements Sequence {

  private int mN = 0;
  private LongDynamicArray<byte[]> mPrev = null;

  // Only need to check last digit since already checked
  // earlier parts
  private boolean isSas(final byte[] sas) {
    final int[] f = new int[4];
    // k is length of segments
    for (int k = 1; k <= sas.length / 2; ++k) {
        Arrays.fill(f, 0);
        for (int i = 0; i < k; ++i) {
          f[sas[i]]++;
        }
        for (int i = 0; i < k; ++i) {
          f[sas[k + i]]--;
        }
        boolean fail = true;
        for (final int v : f) {
          fail &= v == 0;
        }
        if (fail) {
          return false;
        }
    }
    return true;
  }

  private long count(final int n) {
    final LongDynamicArray<byte[]> sas = new LongDynamicArray<>();
    if (mPrev == null) {
      sas.set(0, new byte[] {0});
    } else {
      long i = 0;
      for (long k = 0; k < mPrev.length(); ++k) {
        final byte[] t = new byte[n];
        System.arraycopy(mPrev.get(k), 0, t, 1, n - 1);
        for (int j = 0; j < 4; ++j) {
          final byte[] u = Arrays.copyOf(t, t.length);
          u[0] = (byte) j;
          if (isSas(u)) {
            sas.set(i++, u);
          }
        }
      }
    }
    mPrev = sas;
    return sas.length();
  }

  @Override
  public Z next() {
    return Z.valueOf(count(++mN)).shiftLeft(2);
  }
}


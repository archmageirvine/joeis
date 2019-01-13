package irvine.factor.gnfs;

import java.util.Arrays;

/**
 * Multiply vector and matrix. Not thread safe.
 *
 * @author Kleinjung Thorsten
 * @author Sean A. Irvine
 */
final class VectorTimesMatrix {

  private VectorTimesMatrix() { }

  private static final long[] WORKSPACE = new long[2048];

  static void multiplyVectorMatrix(final long[] v1, final long[] m, final long[] v2, final int cols) {
    Arrays.fill(WORKSPACE, 0);
    for (int k = 0, hoi = 0; k < 8; ++k, hoi += 256) {
      final int k8 = k << 3;
      long h = m[k8 + 7];
      for (int i = 1; i < 256; i += 2) {
        WORKSPACE[hoi + i] ^= h;
      }
      h = m[k8 + 6];
      for (int i = 2; i < 256; i += 4) {
        WORKSPACE[hoi + i] ^= h;
        WORKSPACE[hoi + i + 1] ^= h;
      }
      int zp = 4;
      for (int l = k8 + 5; l >= k8; --l) {
        for (int i = zp; i < 256; i += zp) {
          for (int j = 0; j < zp; ++j) {
            WORKSPACE[hoi + i++] ^= m[l];
          }
        }
        zp <<= 1;
      }
    }
    for (int i = 0; i < cols; ++i) {
      long u = v1[i];
      long h2 = WORKSPACE[1792 + ((int) u & 0xFF)];
      u >>>= 8;
      h2 ^= WORKSPACE[1536 + ((int) u & 0xFF)];
      u >>>= 8;
      h2 ^= WORKSPACE[1280 + ((int) u & 0xFF)];
      u >>>= 8;
      h2 ^= WORKSPACE[1024 + ((int) u & 0xFF)];
      u >>>= 8;
      h2 ^= WORKSPACE[768 + ((int) u & 0xFF)];
      u >>>= 8;
      h2 ^= WORKSPACE[512 + ((int) u & 0xFF)];
      u >>>= 8;
      h2 ^= WORKSPACE[256 + ((int) u & 0xFF)];
      u >>>= 8;
      h2 ^= WORKSPACE[(int) u & 0xFF];
      v2[i] = h2;
    }
  }

  private static final boolean[] BITPAR = {
    false, true, true, false, true, false, false, true, true, false,
    false, true, false, true, true, false, true, false, false, true,
    false, true, true, false, false, true, true, false, true, false,
    false, true, true, false, false, true, false, true, true, false,
    false, true, true, false, true, false, false, true, false, true,
    true, false, true, false, false, true, true, false, false, true,
    false, true, true, false, true, false, false, true, false, true,
    true, false, false, true, true, false, true, false, false, true,
    false, true, true, false, true, false, false, true, true, false,
    false, true, false, true, true, false, false, true, true, false,
    true, false, false, true, true, false, false, true, false, true,
    true, false, true, false, false, true, false, true, true, false,
    false, true, true, false, true, false, false, true, true, false,
    false, true, false, true, true, false, false, true, true, false,
    true, false, false, true, false, true, true, false, true, false,
    false, true, true, false, false, true, false, true, true, false,
    false, true, true, false, true, false, false, true, true, false,
    false, true, false, true, true, false, true, false, false, true,
    false, true, true, false, false, true, true, false, true, false,
    false, true, false, true, true, false, true, false, false, true,
    true, false, false, true, false, true, true, false, true, false,
    false, true, false, true, true, false, false, true, true, false,
    true, false, false, true, true, false, false, true, false, true,
    true, false, false, true, true, false, true, false, false, true,
    false, true, true, false, true, false, false, true, true, false,
    false, true, false, true, true, false
  };

  static void multiplyVectorMatrixF(final long[] v1, final long[] m, final long[] v2, final int cols) {
    int i = 0;
    long s2 = 0L;
    while (i < 64) {
      if ((s2 = m[i]) != 0) {
        break;
      }
      ++i;
    }
    if (i == 64) {
      Arrays.fill(v2, 0L);
      return;
    }
    long s1 = 0L;
    long mask = 0x8000000000000000L;
    for (int j = 0; j < 64; ++j) {
      if (m[j] != 0) {
        s1 ^= mask;
      }
      mask >>>= 1;
    }
    for (int j = 0; j < cols; ++j) {
      final long h = v1[j] & s1;
      final int hi = (int) (h ^ (h >>> 32));
      final int hs = hi ^ (hi >>> 16);
      final int hb = (hs ^ (hs >>> 8)) & 0xFF;
      if (BITPAR[hb]) {
        v2[j] = s2;
      } else {
        v2[j] = 0L;
      }
    }
  }

}

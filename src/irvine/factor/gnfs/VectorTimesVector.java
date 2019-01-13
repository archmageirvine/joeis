package irvine.factor.gnfs;

import java.util.Arrays;

/**
 * Vector times a vector implementation.  This is not thread safe since
 * the workspace is shared.
 *
 * @author Kleinjung Thorsten
 * @author Sean A. Irvine
 */
final class VectorTimesVector {

  private VectorTimesVector() { }
  
  private static final long[] WORKSPACE = new long[2048];

  static void multiplyVectorVector(final long[] v1, final long[] v2, final long[] m, final int cols) {
    Arrays.fill(WORKSPACE, 0L);
    for (int i = 0; i < cols; ++i) {
      final long h2 = v2[i];

      long u = v1[i];
      WORKSPACE[1792 + ((int) u & 0xFF)] ^= h2;
      u >>>= 8;
      WORKSPACE[1536 + ((int) u & 0xFF)] ^= h2;
      u >>>= 8;
      WORKSPACE[1280 + ((int) u & 0xFF)] ^= h2;
      u >>>= 8;
      WORKSPACE[1024 + ((int) u & 0xFF)] ^= h2;
      u >>>= 8;
      WORKSPACE[768 + ((int) u & 0xFF)] ^= h2;
      u >>>= 8;
      WORKSPACE[512 + ((int) u & 0xFF)] ^= h2;
      u >>>= 8;
      WORKSPACE[256 + ((int) u & 0xFF)] ^= h2;
      u >>>= 8;
      WORKSPACE[(int) u & 0xFF] ^= h2;
    }
    Arrays.fill(m, 0L);
    for (int k = 0, hoi = 0; k < 8; ++k) {
      final int k8 = k << 3;
      long h1 = 0L;
      for (int i = 1; i < 256; i += 2) {
        h1 ^= WORKSPACE[hoi + i];
      }
      m[k8 + 7] = h1;
      h1 = 0L;
      for (int i = 2; i < 256; i += 4) {
        h1 ^= WORKSPACE[hoi + i];
        h1 ^= WORKSPACE[hoi + i + 1];
      }
      m[k8 + 6] = h1;
      int zp = 4;
      for (int l = k8 + 5; l > k8; --l) {
        h1 = 0L;
        for (int i = zp; i < 256; i += zp) {
          for (int j = 0; j < zp; ++j) {
            h1 ^= WORKSPACE[hoi + i++];
          }
        }
        m[l] = h1;
        zp <<= 1;
      }
      h1 = 0L;
      for (int i = 128; i < 256; ++i) {
        h1 ^= WORKSPACE[hoi + i];
      }
      m[k8] = h1;
      hoi += 256;
    }
  }
}

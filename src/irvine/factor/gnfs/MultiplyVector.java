package irvine.factor.gnfs;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Vector multiply.
 *
 * @author Kleinjung Thorsten
 * @author Sean A. Irvine
 */
final class MultiplyVector implements Serializable {

  private MultiplyVector() { }

  private static final int MASK_BIT = 0x80000000;

  // Workspace
  private static final long[] TL = new long[1024];
  private static final int[] TI = new int[1024];

  static void multiplyVector(final long[] v, final long[] m) {
    Arrays.fill(TL, 0L);
    Arrays.fill(TI, 0);

    for (long u : v) {
      final long h = u;
      final int hu = (int) h;

      TI[768 + ((int) u & 0xFF)] ^= hu;
      u >>>= 8;
      TI[512 + ((int) u & 0xFF)] ^= hu;
      u >>>= 8;
      TI[256 + ((int) u & 0xFF)] ^= hu;
      u >>>= 8;
      TI[(int) u & 0xFF] ^= hu;
      u >>>= 8;
      TL[768 + ((int) u & 0xFF)] ^= h;
      u >>>= 8;
      TL[512 + ((int) u & 0xFF)] ^= h;
      u >>>= 8;
      TL[256 + ((int) u & 0xFF)] ^= h;
      u >>>= 8;
      TL[(int) u] ^= h;
    }
    Arrays.fill(m, 0L);
    int hoi = 0;
    for (int k = 0; k < 4; ++k) {
      final int k8 = k << 3;
      long h = 0L;
      for (int i = 1; i < 256; i += 2) {
        h ^= TL[hoi + i];
      }
      m[k8 + 7] = h;
      h = 0L;
      for (int i = 2; i < 256; i += 4) {
        h ^= TL[hoi + i];
        h ^= TL[hoi + i + 1];
      }
      m[k8 + 6] = h;
      int zp = 4;
      for (int l = k8 + 5; l > k8; --l) {
        h = 0L;
        for (int i = zp; i < 256; i += zp) {
          for (int j = 0; j < zp; ++j) {
            h ^= TL[hoi + i++];
          }
        }
        m[l] = h;
        zp <<= 1;
      }
      h = 0L;
      for (int i = 128; i < 256; ++i) {
        h ^= TL[hoi + i];
      }
      m[k8] = h;
      hoi += 256;
    }

    hoi = 0;
    for (int k = 0; k < 4; ++k) {
      final int k8 = k << 3;
      int hu = 0;
      for (int i = 1; i < 256; i += 2) {
        hu ^= TI[hoi + i];
      }
      //        m[32 + k8 + 7] &= ~0xFFFFFFFFL;
      m[32 + k8 + 7] = hu;
      hu = 0;
      for (int i = 2; i < 256; i += 4) {
        hu ^= TI[hoi + i];
        hu ^= TI[hoi + i + 1];
      }
      //        m[32 + k8 + 6] &= ~0xFFFFFFFFL;
      m[32 + k8 + 6] = hu;
      int zp = 4;
      for (int l = k8 + 5; l > k8; --l) {
        hu = 0;
        for (int i = zp; i < 256; i += zp) {
          for (int j = 0; j < zp; ++j) {
            hu ^= TI[hoi + i++];
          }
        }
        //          m[32 + l] &= ~0xFFFFFFFFL;
        m[32 + l] = hu;
        zp <<= 1;
      }
      hu = 0;
      for (int i = 128; i < 256; ++i) {
        hu ^= TI[hoi + i];
      }
      //        m[32 + k8] &= ~0xFFFFFFFFL;
      m[32 + k8] = hu;
      hoi += 256;
    }

    // transpose
    for (int i = 0; i < 32; ++i) {
      int hu = 0;
      final int mau = MASK_BIT >>> i;
      for (int j = 0; j < 32; ++j) {
        // int cast below is CRITICAL to stop mau promotion
        if (((int) m[j] & mau) != 0) {
          hu ^= MASK_BIT >>> j;
        }
      }
      m[32 + i] &= 0xFFFFFFFFL;
      m[32 + i] |= (long) hu << 32;
    }
  }
}

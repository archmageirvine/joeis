package irvine.oeis.a326;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A326295 allocated for Matthias Wenzel.
 * @author Sean A. Irvine
 */
public class A326295 implements Sequence {

  // After Andreas Sterbenz

  // There are multiple MD4 implementations available for Java in various libraries, but
  // we have an explicit implementation here to avoid excessive dependence on another library

  private boolean mSawZero = false;
  private long mN = -1;

  private int[] mMd4 = new int[4];
  private int[] mX = new int[16];

  // rotation constants
  private static final int S11 = 3;
  private static final int S12 = 7;
  private static final int S13 = 11;
  private static final int S14 = 19;
  private static final int S21 = 3;
  private static final int S22 = 5;
  private static final int S23 = 9;
  private static final int S24 = 13;
  private static final int S31 = 3;
  private static final int S32 = 9;
  private static final int S33 = 11;
  private static final int S34 = 15;

  private void reset() {
    mMd4[0] = 0x67452301;
    mMd4[1] = 0xefcdab89;
    mMd4[2] = 0x98badcfe;
    mMd4[3] = 0x10325476;
  }

  private static int ff(int a, final int b, final int c, final int d, final int x, final int s) {
    a += ((b & c) | ((~b) & d)) + x;
    return (a << s) | (a >>> (32 - s));
  }

  private static int gg(int a, final int b, final int c, final int d, final int x, final int s) {
    a += ((b & c) | (b & d) | (c & d)) + x + 0x5a827999;
    return (a << s) | (a >>> (32 - s));
  }

  private static int hh(int a, final int b, final int c, final int d, final int x, final int s) {
    a += ((b ^ c) ^ d) + x + 0x6ed9eba1;
    return (a << s) | (a >>> (32 - s));
  }

  void md4() {
    int a = mMd4[0];
    int b = mMd4[1];
    int c = mMd4[2];
    int d = mMd4[3];

    /* Round 1 */
    a = ff(a, b, c, d, mX[0], S11);  /*  1 */
    d = ff(d, a, b, c, mX[1], S12);  /*  2 */
    c = ff(c, d, a, b, mX[2], S13);  /*  3 */
    b = ff(b, c, d, a, mX[3], S14);  /*  4 */
    a = ff(a, b, c, d, mX[4], S11);  /*  5 */
    d = ff(d, a, b, c, mX[5], S12);  /*  6 */
    c = ff(c, d, a, b, mX[6], S13);  /*  7 */
    b = ff(b, c, d, a, mX[7], S14);  /*  8 */
    a = ff(a, b, c, d, mX[8], S11);  /*  9 */
    d = ff(d, a, b, c, mX[9], S12);  /* 10 */
    c = ff(c, d, a, b, mX[10], S13); /* 11 */
    b = ff(b, c, d, a, mX[11], S14); /* 12 */
    a = ff(a, b, c, d, mX[12], S11); /* 13 */
    d = ff(d, a, b, c, mX[13], S12); /* 14 */
    c = ff(c, d, a, b, mX[14], S13); /* 15 */
    b = ff(b, c, d, a, mX[15], S14); /* 16 */

    /* Round 2 */
    a = gg(a, b, c, d, mX[0], S21);  /* 17 */
    d = gg(d, a, b, c, mX[4], S22);  /* 18 */
    c = gg(c, d, a, b, mX[8], S23);  /* 19 */
    b = gg(b, c, d, a, mX[12], S24); /* 20 */
    a = gg(a, b, c, d, mX[1], S21);  /* 21 */
    d = gg(d, a, b, c, mX[5], S22);  /* 22 */
    c = gg(c, d, a, b, mX[9], S23);  /* 23 */
    b = gg(b, c, d, a, mX[13], S24); /* 24 */
    a = gg(a, b, c, d, mX[2], S21);  /* 25 */
    d = gg(d, a, b, c, mX[6], S22);  /* 26 */
    c = gg(c, d, a, b, mX[10], S23); /* 27 */
    b = gg(b, c, d, a, mX[14], S24); /* 28 */
    a = gg(a, b, c, d, mX[3], S21);  /* 29 */
    d = gg(d, a, b, c, mX[7], S22);  /* 30 */
    c = gg(c, d, a, b, mX[11], S23); /* 31 */
    b = gg(b, c, d, a, mX[15], S24); /* 32 */

    /* Round 3 */
    a = hh(a, b, c, d, mX[0], S31);  /* 33 */
    d = hh(d, a, b, c, mX[8], S32);  /* 34 */
    c = hh(c, d, a, b, mX[4], S33);  /* 35 */
    b = hh(b, c, d, a, mX[12], S34); /* 36 */
    a = hh(a, b, c, d, mX[2], S31);  /* 37 */
    d = hh(d, a, b, c, mX[10], S32); /* 38 */
    c = hh(c, d, a, b, mX[6], S33);  /* 39 */
    b = hh(b, c, d, a, mX[14], S34); /* 40 */
    a = hh(a, b, c, d, mX[1], S31);  /* 41 */
    d = hh(d, a, b, c, mX[9], S32);  /* 42 */
    c = hh(c, d, a, b, mX[5], S33);  /* 43 */
    b = hh(b, c, d, a, mX[13], S34); /* 44 */
    a = hh(a, b, c, d, mX[3], S31);  /* 45 */
    d = hh(d, a, b, c, mX[11], S32); /* 46 */
    c = hh(c, d, a, b, mX[7], S33);  /* 47 */
    b = hh(b, c, d, a, mX[15], S34); /* 48 */

    mMd4[0] += a;
    mMd4[1] += b;
    mMd4[2] += c;
    mMd4[3] += d;
  }

  private void md4OfLong(final long n) {
    Arrays.fill(mX, 0);
    mX[0] = (int) n;
    mX[1] = (int) (n >>> 32);
    mX[2] = 0x80; // append padding "1" bit
    mX[mX.length - 2] = Long.SIZE;
    reset();
    md4();
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == 0) {
        if (mSawZero) {
          return null; // finished (i.e. we have tried all 2^64 possible value -- not actually likely to happen
        }
        mSawZero = true;
      }
      md4OfLong(mN);
      final String binaryMd4 = IntegerUtils.toBinaryString(Integer.reverseBytes(mMd4[0])) + IntegerUtils.toBinaryString(Integer.reverseBytes(mMd4[1])) + IntegerUtils.toBinaryString(Integer.reverseBytes(mMd4[2])) + IntegerUtils.toBinaryString(Integer.reverseBytes(mMd4[3]));
      if (binaryMd4.contains(Long.toBinaryString(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

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

  private long mN = 775343302;

  private int[] mMd4 = new int[4];
  private int[] x = new int[16];
  private int bytesProcessed = 0;

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

  /**
   * Reset the state of this object.
   */
  void implReset() {
    // Load magic initialization constants.
    mMd4[0] = 0x67452301;
    mMd4[1] = 0xefcdab89;
    mMd4[2] = 0x98badcfe;
    mMd4[3] = 0x10325476;
  }

//  /**
//   * Perform the final computations, any buffered bytes are added
//   * to the digest, the count is added to the digest, and the resulting
//   * digest is stored.
//   */
//  void implDigest(byte[] out, int ofs) {
//    long bitsProcessed = bytesProcessed << 3;
//
//    int index = (int) bytesProcessed & 0x3f;
//    int padLen = (index < 56) ? (56 - index) : (120 - index);
//    engineUpdate(padding, 0, padLen);
//
//    i2bLittle4((int) bitsProcessed, buffer, 56);
//    i2bLittle4((int) (bitsProcessed >>> 32), buffer, 60);
//    implCompress(buffer, 0);
//
//    i2bLittle(mMd4, 0, out, ofs, 16);
//  }

  private static int ff(int a, int b, int c, int d, int x, int s) {
    a += ((b & c) | ((~b) & d)) + x;
    return ((a << s) | (a >>> (32 - s)));
  }

  private static int gg(int a, int b, int c, int d, int x, int s) {
    a += ((b & c) | (b & d) | (c & d)) + x + 0x5a827999;
    return ((a << s) | (a >>> (32 - s)));
  }

  private static int hh(int a, int b, int c, int d, int x, int s) {
    a += ((b ^ c) ^ d) + x + 0x6ed9eba1;
    return ((a << s) | (a >>> (32 - s)));
  }

  private void md4(final long n) {
//    Arrays.fill(x, 0);
////    x[0] = Integer.reverseBytes((int) (n >>> 32));
////    x[1] = Integer.reverseBytes((int) n);
//    x[0] = (int) (n >>> 32);
//    x[1] = (int) n;
//    x[2] = 0x80000000;
//    x[x.length - 2] = Integer.reverseBytes(64);
//    implReset();
//    //System.out.println(Arrays.toString(x));
//    md4();
//    // todo this is ok but endianness swap needed before return
////    long a = (((long) mMd4[0]) << 32) | mMd4[1];
////    a = LongUtils.endian(a);
////    System.out.println(LongUtils.toBinaryString(a));

    Arrays.fill(x, 0);
    x[0] = 0x80000000;
    implReset();
    md4();
    // todo this is ok but endianness swap needed before return
//    long a = (((long) mMd4[0]) << 32) | mMd4[1];
//    a = LongUtils.endian(a);
//    System.out.println(LongUtils.toBinaryString(a));
  }

  /**
   * This is where the functions come together as the generic MD4
   * transformation operation. It consumes sixteen
   * bytes from the buffer, beginning at the specified offset.
   */
  void md4() {
    int a = mMd4[0];
    int b = mMd4[1];
    int c = mMd4[2];
    int d = mMd4[3];

    /* Round 1 */
    a = ff(a, b, c, d, x[0], S11); /* 1 */
    d = ff(d, a, b, c, x[1], S12); /* 2 */
    c = ff(c, d, a, b, x[2], S13); /* 3 */
    b = ff(b, c, d, a, x[3], S14); /* 4 */
    a = ff(a, b, c, d, x[4], S11); /* 5 */
    d = ff(d, a, b, c, x[5], S12); /* 6 */
    c = ff(c, d, a, b, x[6], S13); /* 7 */
    b = ff(b, c, d, a, x[7], S14); /* 8 */
    a = ff(a, b, c, d, x[8], S11); /* 9 */
    d = ff(d, a, b, c, x[9], S12); /* 10 */
    c = ff(c, d, a, b, x[10], S13); /* 11 */
    b = ff(b, c, d, a, x[11], S14); /* 12 */
    a = ff(a, b, c, d, x[12], S11); /* 13 */
    d = ff(d, a, b, c, x[13], S12); /* 14 */
    c = ff(c, d, a, b, x[14], S13); /* 15 */
    b = ff(b, c, d, a, x[15], S14); /* 16 */

    /* Round 2 */
    a = gg(a, b, c, d, x[0], S21); /* 17 */
    d = gg(d, a, b, c, x[4], S22); /* 18 */
    c = gg(c, d, a, b, x[8], S23); /* 19 */
    b = gg(b, c, d, a, x[12], S24); /* 20 */
    a = gg(a, b, c, d, x[1], S21); /* 21 */
    d = gg(d, a, b, c, x[5], S22); /* 22 */
    c = gg(c, d, a, b, x[9], S23); /* 23 */
    b = gg(b, c, d, a, x[13], S24); /* 24 */
    a = gg(a, b, c, d, x[2], S21); /* 25 */
    d = gg(d, a, b, c, x[6], S22); /* 26 */
    c = gg(c, d, a, b, x[10], S23); /* 27 */
    b = gg(b, c, d, a, x[14], S24); /* 28 */
    a = gg(a, b, c, d, x[3], S21); /* 29 */
    d = gg(d, a, b, c, x[7], S22); /* 30 */
    c = gg(c, d, a, b, x[11], S23); /* 31 */
    b = gg(b, c, d, a, x[15], S24); /* 32 */

    /* Round 3 */
    a = hh(a, b, c, d, x[0], S31); /* 33 */
    d = hh(d, a, b, c, x[8], S32); /* 34 */
    c = hh(c, d, a, b, x[4], S33); /* 35 */
    b = hh(b, c, d, a, x[12], S34); /* 36 */
    a = hh(a, b, c, d, x[2], S31); /* 37 */
    d = hh(d, a, b, c, x[10], S32); /* 38 */
    c = hh(c, d, a, b, x[6], S33); /* 39 */
    b = hh(b, c, d, a, x[14], S34); /* 40 */
    a = hh(a, b, c, d, x[1], S31); /* 41 */
    d = hh(d, a, b, c, x[9], S32); /* 42 */
    c = hh(c, d, a, b, x[5], S33); /* 43 */
    b = hh(b, c, d, a, x[13], S34); /* 44 */
    a = hh(a, b, c, d, x[3], S31); /* 45 */
    d = hh(d, a, b, c, x[11], S32); /* 46 */
    c = hh(c, d, a, b, x[7], S33); /* 47 */
    b = hh(b, c, d, a, x[15], S34); /* 48 */

    mMd4[0] += a;
    mMd4[1] += b;
    mMd4[2] += c;
    mMd4[3] += d;
  }

  @Override
  public Z next() {
    while (true) {
      md4(++mN);
      System.out.println(mN + " " + IntegerUtils.toBinaryString(mMd4[0]) + " " + IntegerUtils.toBinaryString(mMd4[1]) + " " + IntegerUtils.toBinaryString(mMd4[2]) + " " + IntegerUtils.toBinaryString(mMd4[3]));
      System.out.println(mN + " " + IntegerUtils.toBinaryString(Integer.reverseBytes(mMd4[0])) + " " + IntegerUtils.toBinaryString(Integer.reverseBytes(mMd4[1])) + " " + IntegerUtils.toBinaryString(Integer.reverseBytes(mMd4[2])) + " " + IntegerUtils.toBinaryString(Integer.reverseBytes(mMd4[3])));
    }
  }
}
